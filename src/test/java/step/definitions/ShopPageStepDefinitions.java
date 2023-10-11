package step.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.ShopPage;

public class ShopPageStepDefinitions {
    ShopPage shopPage = new ShopPage();

    @When("Guest goes to a new page and clicks the buy button")
    public void clickOnBuyButton() {
        shopPage.clickOnBuyButton();
    }

    @Then("Guest verifies that order confirmation found")
    public void isOrderConfirmationFound() {
        Assert.assertTrue(shopPage.isOrderConfirmationFound());
    }
}
