package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;


public class BasketPage {
    static String price;
    private WebDriver driver;
    private ElementUtil elementUtil;
    private By text_forthProductDetailPrice=By.xpath("(//span[@class='a-price a-text-price'])[2]");
    private By button_addBasketButton=By.id("add-to-cart-button");
    private By button_mainBasket=By.id("nav-cart-text-container");
    private By text_basketPageTitle=By.cssSelector("[class='a-row sc-cart-header sc-compact-bottom'] div");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    public String setGetProductPrice() {
        price=driver.findElement(text_forthProductDetailPrice).getText();
        return price;
    }

    public void priceEqualsCheck() throws InterruptedException {
        setGetProductPrice();
        elementUtil.comparePrices(price,ProductPage.getBasketPrice);
    }

    public void clickAddBasket() {
        elementUtil.clickElement(button_addBasketButton);
    }

    public void goToBasketPage() {
        elementUtil.clickElement(button_mainBasket);
    }

    public void controlMainBasketTitle(String shoppingPageTitle) {
        elementUtil.getText(text_basketPageTitle,shoppingPageTitle);
    }
}
