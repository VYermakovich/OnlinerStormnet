package onliner;

import framework.BaseTest;
import io.qameta.allure.Description;
import onliner.pageObject.CatalogPage;
import onliner.pageObject.MainPage;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    @Description("Переход на страницу 'Ноутбуки, компьютеры, мониторы'. Ожидаемый результат: Страница 'Ноутбуки, компьютеры, мониторы' загрузилась.")
    public void navigationMenuTest() {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu("Каталог");

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToMainMenuItem("Компьютеры");
        catalogPage.navigateToSubMenuItems("Ноутбуки, компьютеры, мониторы");
        catalogPage.navigateToSubMenuCategory("Игровые ноутбуки");
    }

    /*
     * 1. Перейти на вкладку Каталог
     * 2. Выбрать Компьютеры и сети в меню навигации
     * 3.  В подменю навести на  Ноутбуки, компьютеры, мониторы
     * 4. Перейти на страницу Игровые ноутбуки*/
}
