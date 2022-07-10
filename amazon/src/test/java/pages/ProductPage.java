package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class ProductPage {
    static String  getBasketPrice;
    private WebDriver driver;
    private ElementUtil elementUtil;

    private By text_searchedProductName=By.xpath("//*[@class='a-color-state a-text-bold']");
    private By text_forthProduct=By.xpath("(//*[@class='a-price-whole'])[4]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    public void controlSearchedText(String searchedKey) {
        elementUtil.getText(text_searchedProductName,searchedKey);
    }

    public String setProductPrice() {
        getBasketPrice="€"+driver.findElement(text_forthProduct).getText();
        return getBasketPrice;
    }

    public void clickForthProduct() {
        elementUtil.clickElement(text_forthProduct);
    }

}
