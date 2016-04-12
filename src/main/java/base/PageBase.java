package base;

import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertTrue;

public class PageBase {
    protected void shouldAppear(WebDriver driver, String title) {
        assertTrue("Title is incorrect. Actual: " + driver.getTitle() + ", expected: " + title, driver.getTitle().contains(title));
    }
}
