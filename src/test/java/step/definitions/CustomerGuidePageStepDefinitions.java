package step.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.CustomerGuidePage;

public class CustomerGuidePageStepDefinitions {
    CustomerGuidePage customerGuidePage = new CustomerGuidePage();

    @When("Guest clicks on search and enters the query {string}")
    public void clicksOnSearchAndEntersTheQuery(String input) {
        customerGuidePage.clicksOnSearchAndEntersTheQuery(input);
    }

    @When("Clicks on the section in the prompts")
    public void selectOptionFromDrop_DownList() {
        customerGuidePage.selectOptionFromDrop_DownList();
    }

    @Then("Guest verifies that they see the title {string}")
    public void checkTheCorrectPageOpened(String expectedTitle) {
        Assert.assertTrue(customerGuidePage.findTitle().contains(expectedTitle));
    }

    @Then("Guest verifies that Customer Guide Page title contains {string} word")
    public void checkTheTitleContainsRelevantTheRequest(String expectedTitle) {
        Assert.assertTrue(customerGuidePage.getActualTitle().contains(expectedTitle));
    }
}
