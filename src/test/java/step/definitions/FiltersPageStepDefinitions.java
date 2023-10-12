package step.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.FiltersPage;


public class FiltersPageStepDefinitions {
    FiltersPage filtersPage = new FiltersPage();

    @When("Guest  clicks on the link computer table")
    public void clickOnComputerTableLink() {
        filtersPage.clickOnComputerTableLink();
    }

    @When("Guest set upper price to {int}")
    public void setUpperPriceToFilter(int upperPrice) {
        filtersPage.setUpperPriceToFilter(upperPrice);
    }

    @When("Clicks on OK button")
    public void clickOnOkButton() {
        filtersPage.clickOnOkButtonAndWaitForProductsReload();
    }

    @Then("Verify that all prices are less than {int} value")
    public void verifyPricesAreLessThanExpectedValue(int expectedValue) {
        boolean result = filtersPage.verifyPricesAreLessThanExpectedValue(expectedValue);
        Assert.assertTrue(result);
    }

}




