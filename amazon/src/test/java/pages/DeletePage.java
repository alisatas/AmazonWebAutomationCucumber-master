package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class DeletePage {
    private WebDriver driver;
    private ElementUtil elementUtil;
    private By button_delete=By.xpath("//input[@value='Verwijderen']");

    public DeletePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    public void clickDeleteButton() {
        elementUtil.clickElement(button_delete);
    }
}
