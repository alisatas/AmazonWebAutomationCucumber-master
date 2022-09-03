package stepDefinitions;

import io.cucumber.java.en.And;
import pages.DeletePage;
import util.DriverFactory;

public class DeletePageStepDefs {
    private DeletePage deletePage  =new DeletePage(DriverFactory.getDriver());

    @And("user clicks to delete button")
    public void userClicksToDeleteButton() {
        deletePage.clickDeleteButton();
    }
}
