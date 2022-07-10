package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class HomePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    private By link_amazonLogo=By.id("nav-logo-sprites");
    private By text_searchArea=By.id("twotabsearchtextbox");
    private By button_searchIcon=By.id("nav-search-submit-button");
    private By button_acceptCookies=By.id("sp-cc-accept");
    private By button_inloggen=By.xpath("//*[contains(text(),'Inloggen')]");
    private By text_halloInlogen=By.id("nav-link-accountList-nav-line-1");
    private By text_retourzendingen=By.xpath("//*[contains(text(),'Retourzendingen')]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }


    public void linkTextControl(String expectedURL) {
        elementUtil.checkURLContains(expectedURL);
    }


    public void amazonLogoControl(String logo) {
        elementUtil.elementIsDisplayed(link_amazonLogo,logo);
    }

    public void searchFieldIsDisplayed(String searchField) {
        elementUtil.elementIsDisplayed(text_searchArea,searchField);
    }

    public void searchingProduct(String productName) {
        elementUtil.sendKey(text_searchArea,productName);
    }

    public void searchButtonIsDisplayed(String searchButton) {
        elementUtil.elementIsDisplayed(button_searchIcon,searchButton);
    }

    public void acceptCookies() {
        elementUtil.clickElement(button_acceptCookies);
    }

    public void clickSearchButton() {
        elementUtil.clickElement(button_searchIcon);
    }

    public void loginButtonIsDisplayed(String loginButton) {
        elementUtil.elementIsDisplayed(button_inloggen,loginButton);
    }

    public void hoverToLoginButton() {
        elementUtil.hoverElement(text_halloInlogen);
    }

    public void halloInloggenIsDisplayed(String halloInloggen) {
        elementUtil.elementIsDisplayed(text_halloInlogen,halloInloggen);
    }


    public void retourzindingenIsDisplayed(String retourzindingen) {
        elementUtil.elementIsDisplayed(text_retourzendingen,retourzindingen);
    }
}