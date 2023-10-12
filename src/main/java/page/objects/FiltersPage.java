package page.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class FiltersPage {
    public void clickOnComputerTableLink() {
        $x("//a[@href='/ua/dom-ofisnye-i-kompyuternye-stoly/ikea-utespelare-80507627/']").shouldBe(Condition.visible).click();
    }

    public void setUpperPriceToFilter(Integer upperPrice) {
        $x("//input[@class='filter-price__range-field field'][2]").clear();
        $x("//input[@class='filter-price__range-field field'][2]").setValue(upperPrice.toString());
    }

    public void clickOnOkButtonAndWaitForProductsReload() {
        List<String> oldElements = $$x("//div[@class='list-item list-item--row']").stream()
                .map(SelenideElement::getText)
                .collect(Collectors.toList());

        $x("//button[@class='filter-price__range-btn btn btn--graphite'][1]").shouldBe(Condition.visible).click();

        waitWhileElementsRedrawn("//div[@class='list-item list-item--row']", oldElements);
    }

    public List<Integer> getPrices() {
        ElementsCollection priceElements = $$(".price__value");
        List<Integer> parsedPrices = new ArrayList<>();
        for (int i = 0; i < priceElements.size(); i++) {
            String actualPrice = priceElements.get(i).getText().replaceAll(" ", "");
            parsedPrices.add(Integer.parseInt(actualPrice));
        }
        return parsedPrices;
    }

    public boolean verifyPricesAreLessThanExpectedValue(int expectedValue) {
        List<Integer> prices = getPrices();
        return prices.stream().allMatch(price -> price < expectedValue);
    }

    private void waitWhileElementsRedrawn(String newElementsXpath, List<String> oldElementsState) {
        while (true) {
            ElementsCollection newElements = $$x(newElementsXpath);
            for (int i = 0; i < oldElementsState.size(); i++) {
                String oldElementText = oldElementsState.get(i);
                String newElementText = newElements.get(i).getText();
                if (!oldElementText.equals(newElementText)) {
                    return;
                }
            }
        }
    }

}

