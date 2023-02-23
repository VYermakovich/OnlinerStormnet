package onliner.pageObject;

import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.awt.*;

public class AutobarakholkaPage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//h1[contains(text(),'Автобарахолка')]"));
    private static final Button BTN_CURRENCY = new Button(By.xpath("//div[@class='vehicle-form__group vehicle-form__group_width_full']//a[text()='USD']"));

    @Step("Проверка загрузившейся страницы.")
    public void isPageOpened() {
        Assert.assertTrue(PAGE_LOCATOR.isDisplayed(), "ERROR: Страница 'Main Page' не была загружена!!!");
    }
}
