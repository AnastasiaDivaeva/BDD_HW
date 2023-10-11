package step.definitions;

import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.FiltersPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;

public class FiltersPageStepDefinitions {
    FiltersPage filtersPage = new FiltersPage();

    @When("Guest  clicks on the link computer table")
    public void clickOnComputerTableLink() {
        filtersPage.clickOnComputerTableLink();
    }

    @When("Guest set upper price to {int}")
    public void setUpperPriceToFilter(Integer upperPrice) {
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
    public void verifyPricesAreLessThanExpectedValue(Integer expectedValue) {
        filtersPage.verifyPricesAreLessThanExpectedValue(expectedValue);
    }

}




