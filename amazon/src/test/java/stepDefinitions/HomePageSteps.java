package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Given("User controls link {string}")
    public void userControlLink(String expectedURL) {
        homePage.linkTextControl(expectedURL);
    }

    @Then("user controls {string} at top left")
    public void userControlsAtTopLeft(String logo) {
        homePage.amazonLogoControl(logo);

    }

    @Then("user controls searching {string} field")
    public void userControlSearchingField(String searchField) {
        homePage.searchFieldIsDisplayed(searchField);
    }

    @Given("user searches for product {string}")
    public void userSearchesForProduct(String productName) {
        homePage.searchingProduct(productName);
    }

    @Then("user control {string} in search area")
    public void userControlInSearchArea(String searchButton) {
        homePage.searchButtonIsDisplayed(searchButton);
    }

    @And("User accepts cookies")
    public void userAcceptsCookies() {
        homePage.acceptCookies();
    }

    @When("user clicks search button")
    public void userClicksSearchButton() {
        homePage.clickSearchButton();
    }

    @Given("user controls login Button {string}")
    public void userControlLoginButton(String loginButton) {
        homePage.loginButtonIsDisplayed(loginButton);
    }

    @Then("user controls {string} text")
    public void userControlsText(String halloInloggen) {
        homePage.halloInloggenIsDisplayed(halloInloggen);
    }

    @When("user hovers to login button")
    public void userHoverToLoginButton() {
        homePage.hoverToLoginButton();
    }

    @Then("user controls {string} area")
    public void userControlsArea(String retourzindingen) {
        homePage.retourzindingenIsDisplayed(retourzindingen);
    }
}

