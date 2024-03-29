package com.carrefoursa.utilities;


import com.carrefoursa.pages.OrderPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class ReusableMethods {


    public static String givenList_shouldReturnARandomElement() {
        List<String> givenList = Arrays.asList();
        Random rand = new Random();
        String randomElement = rand.toString();
        return randomElement;
    }






    public static WebElement clickFunction(WebElement clickElement) {

        waitForClickablility(clickElement, 3);

        //wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        clickElement.click();
        return clickElement;
    }

    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        //Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        System.out.println("elemTexts.size() = " + elemTexts.size());
        System.out.println("elemTexts = " + elemTexts);
        return elemTexts;

    }

    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    //   HARD WAIT WITH THREAD.SLEEP
//   waitFor(5);  => waits for 5 second
    public static void waitFor(int sec) {
        try {
            sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });

        return element;
    }

    /**
     * Performs double click action on an element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     *
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void closeCerez() {
        WebElement cerez = Driver.getDriver().findElement(By.cssSelector(".cookie-notification.row"));
        if (cerez.isEnabled()) {
            Driver.getDriver().findElement(By.cssSelector(".js-close-notification")).click();
        }

    }


    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);


        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public static void HoverAndClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
        Actions action = new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }




    public static void clickContinueButton() {
        OrderPage orderPage=new OrderPage();
        orderPage.continueButton.click();
    }

    public static String generatePhoneNumber1() {
        Random rand = new Random();
        int num1, num2, num3;
        num1 = rand.nextInt(900) + 100;
        num2 = rand.nextInt(643) + 100;
        num3 = rand.nextInt(9000) + 1000;

        String phoneNumber = ("80" + (Integer.toString(num2)) + (Integer.toString(num3)));
        System.out.println(phoneNumber);
        //806041653
        return phoneNumber;
    }
    public static String generateOtpCode() {
        Random rand = new Random();
        int num1, num2, num3;
        num1 = rand.nextInt(900) + 100;
        num2 = rand.nextInt(643) + 100;
        //num3 = rand.nextInt(900) + 100;
        String otpCode = ((Integer.toString(num1) + Integer.toString(num2)));
        System.out.println(otpCode);
        //806041653
        return otpCode;
    }
    public static boolean retryingFindClick() {
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                Driver.getDriver().findElement(By.xpath("//input[@id='js-site-search-input']")).click();
                result = true;
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        return result;
    }

public boolean verifyelementNotDisplayed(WebElement element){
        try {
            return (!element.isDisplayed());

        }catch (Exception e){
            return false;
        }
}

    public static void scrollDown(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public static void scrollUp(WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}