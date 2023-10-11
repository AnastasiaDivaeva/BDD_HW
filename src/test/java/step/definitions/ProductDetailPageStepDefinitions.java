package step.definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.DetailPage;

public class ProductDetailPageStepDefinitions {
    DetailPage detailPage = new DetailPage();

    @When("Click on product details section")
    public void clickOnProductDetailsSection() {
        detailPage.clickOnProductDetailsSection();
    }

    @When("Click on the buy product button")
    public void clickOnTheBuyProductButton() {
        detailPage.clickOnTheBuyProductButton();
    }

    @Then("Guest verifies that characteristic section title contains {string} word")
    public void verifyCharacteristicSectionTitleContainsWord(String wordToContains) {
        Assert.assertTrue(detailPage.getCharacteristicSectionTitle().contains(wordToContains));
    }

}
