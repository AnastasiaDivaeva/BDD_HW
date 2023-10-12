package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void clickOnComputerTableButton() {
        $x("//a[@data-eventcontext='Компьютерный стол']").click();
    }

    public void clickOnSearchButton(String input) {
        $x("//input[@placeholder='Знайти товар, магазин, бренд']").setValue(input).pressEnter();
    }

    public void clickOnViewAllArticlesButton() {
        $x("//a[contains(text(),'Подивитися всі статті')]").shouldBe(Condition.visible).click();
    }

    public void clickOnGeolocationButton() {
        $x("//div[@class='location flex middle-xs']").click();
    }

    public void choosesCity(String input) {
        $x("//input[@placeholder='Почніть вводити назву']").shouldBe(Condition.visible).setValue(input);
        $x("//div[contains(text(),'Дніпро, Дніпропетровська область')]").click();
    }

    public String getLocationNameAfterChange() {
        $x("//input[@placeholder='Почніть вводити назву']").shouldBe(Condition.hidden);
        return $x("//div[@class='location__city']").getText();
    }
}
