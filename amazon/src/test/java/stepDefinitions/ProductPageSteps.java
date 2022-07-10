package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ProductPage;
import util.DriverFactory;

public class ProductPageSteps {
    private ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    @Then("user should see {string} searched keyword")
    public void userShouldSeeSearchedKeyword(String searchedKey) {
        productPage.controlSearchedText(searchedKey);
    }

    @And("user controls price of the forth product")
    public void userControlPriceOfTheFirstProduct() {
        productPage.setProductPrice();
    }

    @And("user clicks for the forth product on page")
    public void userClicksForTheFirstProductOnPage() {
        productPage.clickForthProduct();
    }

}
