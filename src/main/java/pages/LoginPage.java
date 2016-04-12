package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Locators.getLocator;

public class LoginPage extends PageBase {
    private static final String LOGIN = "strong.zubovich";
    private static final String PASSWORD = "ZXCvbn123!";

    private static final String TITLE = "Mail.Ru: почта, поиск в интернете, новости, игры";

    private static final By LOGIN_FIELD = getLocator("LoginPage.loginField");
    private static final By PASSWORD_FIELD = getLocator("LoginPage.passwordField");
    private static final By BK_RU_OPTION = getLocator("LoginPage.bkRuOption");
    private static final By LOGIN_BUTTON = getLocator("LoginPage.loginButton");

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void shouldAppear() {
        shouldAppear(driver, TITLE);
    }

    public void login() {
        driver.findElement(LOGIN_FIELD).sendKeys(LOGIN);
        driver.findElement(PASSWORD_FIELD).sendKeys(PASSWORD);
        driver.findElement(BK_RU_OPTION).click();
        driver.findElement(LOGIN_BUTTON).click();
    }
}
