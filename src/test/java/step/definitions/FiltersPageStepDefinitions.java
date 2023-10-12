package step.definitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.FiltersPage;

import java.util.List;

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

    @When("Get a list of prices")
    public List<Integer> getPrices() {
        return filtersPage.getPrices();
    }

    @Then("Verify that all prices are less than {int} value")
    public void verifyPricesAreLessThanExpectedValue(int expectedValue) {
        boolean result = filtersPage.verifyPricesAreLessThanExpectedValue(expectedValue);
        Assert.isTrue(result, "");
    }

}




