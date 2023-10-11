package page.objects;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    public String getSearchResultTitle() {
        return $x("//div[@class='search__title']").getText();
    }
}
