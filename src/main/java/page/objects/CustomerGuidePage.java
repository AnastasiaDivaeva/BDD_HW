package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CustomerGuidePage {
    public String findTitle() {
        return $x("//a[@class='black bold']").getText();
    }

    public void clicksOnSearchAndEntersTheQuery(String input) {
        SelenideElement searchLine = $x("//input[@data-search='catalog']").shouldBe(Condition.visible);
        searchLine.click();
        searchLine.setValue(input);
    }

    public void selectOptionFromDrop_DownList() {
        SelenideElement element = $x("//div[text()='Монітори']").shouldBe(Condition.visible);
        element.click();
    }

    public String getActualTitle() {
        return $x("//div[@class='page-catalog']").$x(".//h2").getText();
    }
}
