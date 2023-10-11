package page.objects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;

public class DetailPage {
    public void clickOnProductDetailsSection() {
        $x("//b[contains(text(),'Про товар')]").shouldBe(Condition.visible).click();
    }

    public String getCharacteristicSectionTitle() {
        return $x("//h2[contains(text(),'Характеристики')]").getText();
    }

    public void clickOnTheBuyProductButton() {
        $x("//a[@data-eventcategory='Pages Product Prices'][contains(text(),'markett')]").shouldBe(Condition.visible).click();
    }
}
