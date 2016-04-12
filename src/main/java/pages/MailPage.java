package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static helpers.Locators.getLocator;

public class MailPage extends PageBase {
    private WebDriver driver;
    private static final String TITLE = "Входящие - strong.zubovich@bk.ru - Почта Mail.Ru";

    private static final By COMPOSE_BUTTON = getLocator("MainPage.composeButton");

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void shouldAppear() {
        shouldAppear(driver, TITLE);
    }

    public boolean allUiElementsPresent() {
        try {
            driver.findElement(COMPOSE_BUTTON);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
