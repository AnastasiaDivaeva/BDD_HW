package step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.objects.HomePage;

public class HomePageStepDefinitions {
    private HomePage homePage = new HomePage();

    @Given("Guest open Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("Guest clicks on computer table button")
    public void clickOnComputerTableButton() {
        homePage.clickOnComputerTableButton();
    }

    @When("Guest search product by {string} word")
    public void searchByWord(String wordToSearch) {
        homePage.clickOnSearchButton(wordToSearch);
    }

    @When("Click on view all articles button")
    public void clickOnViewAllArticlesButton() {
        homePage.clickOnViewAllArticlesButton();
    }

    @When("Guest clicks the geolocation button")
    public void clickOnGeolocationButton() {
        homePage.clickOnGeolocationButton();
    }

    @When("Chooses the city of {string}")
    public void choosesCity(String input) {
        homePage.choosesCity(input);
    }

    @Then("Guest verifies that the city name has become {string}")
    public void getTitleAfterChooseCity(String input) {
        String actual = homePage.getLocationNameAfterChange().getText();
        Assert.assertTrue(actual.contains(input));
    }
}
