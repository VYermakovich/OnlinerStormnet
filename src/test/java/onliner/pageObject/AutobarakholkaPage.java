package onliner.pageObject;

import framework.BasePage;
import framework.elements.Button;
import org.openqa.selenium.By;


public class AutobarakholkaPage extends BasePage {
    private static final By PAGE_LOCATOR = By.xpath("//h1[contains(text(),'Автобарахолка')]");
    private static final Button BTN_CURRENCY = new Button(By.xpath("//div[@class='vehicle-form__group vehicle-form__group_width_full']//a[text()='USD']"));

    public AutobarakholkaPage() {
        super(PAGE_LOCATOR, "'Autobaraholka' Page");
    }
}
