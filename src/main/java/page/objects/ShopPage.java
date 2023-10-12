package page.objects;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class ShopPage {
    public void clickOnBuyButton() {
        switchTo().window(1);
        $x("//a[@data-class-state-in-cart='b-custom-button_theme_buy']").click();
    }

    public boolean isOrderConfirmationFound() {
        return $x("//button[contains(text(),'Оформити замовлення')]").shouldBe(Condition.visible).isDisplayed();
    }
}
