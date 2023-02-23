package onliner.pageObject;

import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CatalogPage {
    private static final Label PAGE_LOCATOR = new Label(By.xpath("//div[@class='catalog-navigation__title' and text()='Каталог']"));
    private static final String NAVIGATE_MENU = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'%s')]";
    private static final Label NAV_SUBMENU_CATEGORY =
            new Label(By.xpath("//div[@class='catalog-navigation-list__category']//span[@class='catalog-nav" +
                    "igation-list__dropdown-title' and contains(text(),'Игровые ноутбуки')]"));
    private static final Label NAV_SUBMENU_ITEM = new Label(By.xpath("//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]"));

    @Step("Проверка загрузившейся страницы.")
    public void isPageOpened() {
        Assert.assertTrue(PAGE_LOCATOR.isDisplayed(), "ERROR: Страница 'Main Page' не была загружена!!!");
    }

    @Step("Выбор заголовка 'Компьютеры и сети' в меню навигации.")
    public void navigateToComputers() {
        Label navMenuOnCatalogPage = new Label(By.xpath(String.format(NAVIGATE_MENU, "Компьютеры")));
        navMenuOnCatalogPage.click();
    }

    @Step("Наведение на  'Ноутбуки, компьютеры, мониторы' подменю.")
    public void navigateToSubMenuItems() {
        NAV_SUBMENU_ITEM.moveToElement();
    }

    @Step("Переход на страницу 'Игровые ноутбуки'.")
    public void navigateToSubMenuCategory() {
        NAV_SUBMENU_CATEGORY.moveAndClickByAction();
    }

}
