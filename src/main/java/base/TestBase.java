package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;
import pages.MailPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    protected static final String BASE_URL = "https://mail.ru/";

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(BASE_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.shouldAppear();
        loginPage.login();
        MailPage mailPage = new MailPage(driver);
        mailPage.shouldAppear();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
