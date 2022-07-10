package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ElementUtil {
    public static CustomLogger logger = new CustomLogger(ElementUtil.class);

    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    JavascriptExecutor js;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, 5);
        this.js = (JavascriptExecutor) driver;
    }

    public void clickElement(By element) {
        waitVisibility(element);
        WebElement element1 = driver.findElement(element);
        element1.click();
        logger.info("' " + String.valueOf(element) + " '" + " => Element clicked");
    }

    public WebElement findElement(By element) {
        return waitVisibility(element);
    }

    public List<WebElement> findElements(By element) {
        return waitVisibilities(element);
    }

    public WebElement waitVisibility(By element) {
        WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return elem;
    }

    public List<WebElement> waitVisibilities(By element) {
        List<WebElement> elem = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        return elem;
    }

    public void elementIsDisplayed(By element,String key) {
        waitVisibility(element);
        List<WebElement> elem = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        boolean isDisplayedElement = driver.findElement(element).isDisplayed();
        assertTrue("' " + key + " ' " + " ' " + isDisplayedElement + " '" + " => Is displayed element", isDisplayedElement);
        logger.info("' " + key + " ' " + " ' " + key + " '" + " => Is displayed element");
    }

    public void hoverElement(By element){
        waitVisibility(element);
        Actions actions = new Actions(driver);
        WebElement subMenuOption = driver.findElement(element);
        actions.moveToElement(subMenuOption).perform();
        logger.info( " '" + " => Hovered element=> " + element);

    }


    public void checkURLContains(String expectedURL) {
        String getCurrentUrl = driver.getCurrentUrl();
        org.testng.Assert.assertEquals(getCurrentUrl,expectedURL);
        logger.info("' " + expectedURL + " ' " + " ' " + getCurrentUrl + " '" + " =>  Existing url from expected url");
    }


    public void getText(By element, String getValue) {
        waitVisibility(element);
        String actualTitle = driver.findElement(element).getText();
        List<WebElement> elem = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        logger.info("' " + actualTitle + " ' " + " ' " + getValue + " '" + " =>Element text");
        org.testng.Assert.assertEquals(actualTitle,getValue);
    }

    public void sendKey(By element, String text) {
        waitVisibility(element);
        findElement(element).sendKeys(text);
        logger.info("Text is written");
    }


    public void comparePrices(String actualText,String expectedText) throws InterruptedException {
        org.testng.Assert.assertEquals(actualText, expectedText);
        logger.info(  "Actual text equals to expected text :  " + "actual: "+ actualText  + " " +  "expected" + " " + expectedText);

    }
}