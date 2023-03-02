package onliner.pageObject;

import framework.BasePage;
import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private static final By pageLocator = By.xpath("//img[@class='onliner_logo']");
    private static final String NAV_MENU_ITEM = "//span[@class='b-main-navigation__text' and text()='%s']";

    public MainPage() {
        super(pageLocator, "'Main' Page");
    }

    @Step("Переход на вкладку 'Каталог'.")
    public void navigateHeaderMenu(String headerMenuItem) {
        Label navMenu = new Label(By.xpath(String.format(NAV_MENU_ITEM, headerMenuItem)));
        navMenu.clickAndWait();
    }
}
