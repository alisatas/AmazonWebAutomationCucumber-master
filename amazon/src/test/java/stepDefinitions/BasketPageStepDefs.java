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

    @And("user clicks to add basket button")
    public void userClickToAddBasketButton() {
        basketPage.clickAddBasket();
    }

    @And("user goes to basket page")
    public void userGoesToBasketPage() {
        basketPage.goToBasketPage();
    }

    @And("user controls main title {string}")
    public void userControlsMainTitle(String shoppingMainTitle) {
        basketPage.controlMainBasketTitle(shoppingMainTitle);
    }
}
