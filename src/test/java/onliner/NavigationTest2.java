package onliner;

import framework.BaseTest2;
import io.qameta.allure.Description;
import onliner.pageObject.CatalogPage;
import onliner.pageObject.MainPage;
import org.testng.annotations.Test;

public class NavigationTest2 extends BaseTest2 {

    @Test
    @Description("Переход на страницу 'Ноутбуки, компьютеры, мониторы'. Ожидаемый результат: Страница 'Ноутбуки, компьютеры, мониторы' загрузилась.")
    public void navigationMenuTest() {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu();

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToComputers();
        catalogPage.navigateToSubMenuItems();
        catalogPage.navigateToSubMenuCategory();
    }

    /*
     * 1. Перейти на вкладку Каталог
     * 2. Выбрать Компьютеры и сети в меню навигации
     * 3.  В подменю навести на  Ноутбуки, компьютеры, мониторы
     * 4. Перейти на страницу Игровые ноутбуки*/
}
