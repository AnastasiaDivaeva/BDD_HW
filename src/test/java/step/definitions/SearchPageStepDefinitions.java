package step.definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import page.objects.SearchPage;

public class SearchPageStepDefinitions {
    private SearchPage searchPage = new SearchPage();

    @Then("Guest verifies that Search Result Page title contains {string} word")
    public void verifySearchResultPageTitleContainsWord(String wordToContains) {
        Assert.assertTrue(searchPage.getSearchResultTitle().contains(wordToContains));
    }
}
