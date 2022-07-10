package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;
import util.DriverFactory;

public class BasketPageStepDefs {
    private BasketPage basketPage=new BasketPage(DriverFactory.getDriver());
    @Then("user control prices if equals")
    public void userControlPricesIfEquals() throws InterruptedException {
        basketPage.priceEqualsCheck();
    }

    @And("user click to add basket button")
    public void userClickToAddBasketButton() {
        basketPage.clickAddBasket();
    }
}
