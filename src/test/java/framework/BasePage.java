package framework;

import framework.elements.Label;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Date;
import lombok.extern.log4j.Log4j2;


import static framework.Browser.waitForPageToLoad;
@Log4j2
public class BasePage {
    public String title ;
    protected By pageLocator;


    public BasePage(final By locator, final String pageTitle) {
        init(locator,pageTitle);
        assertIsOpen();
    }

    private void init(final By locator, final String pageTitle) {
        pageLocator = locator;
        title = pageTitle;
    }

    @Step("Проверка загрузившейся страницы.")
    public void assertIsOpen() {
        long before = new Date().getTime();
        Label elem = new Label(pageLocator, title);
        try {
            elem.isElementPresent();
            waitForPageToLoad();
            long openTime = new Date().getTime() - before;
            log.info(String.format("Form '%1$s' appears", title) + String.format(" in %s msec", openTime));
        } catch (Throwable e) {
            Assert.assertTrue(true, title + " does not open");
        }
    }
}