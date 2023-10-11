package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static Map<String, String> HOME_PAGE_CONTEXT = new HashMap<>();
    private static final String LOCATION_KEY = "location";

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
        String currentLocation = getLocationName();
        HOME_PAGE_CONTEXT.put(LOCATION_KEY, currentLocation);
        $x("//input[@placeholder='Почніть вводити назву']").shouldBe(Condition.visible).setValue(input);
        $x("//div[contains(text(),'Дніпро, Дніпропетровська область')]").click();
    }

    public String getLocationNameAfterChange() {
        String oldLocationName = HOME_PAGE_CONTEXT.get(LOCATION_KEY);
        String actualLocationName = getLocationName();
        while (oldLocationName.equals(actualLocationName)) {
            actualLocationName = getLocationName();
        }
        return actualLocationName;
    }

    private String getLocationName() {
        return $x("//div[@class='location__city']").getText();
    }
}
