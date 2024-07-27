package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = StepDefinition.Hooks.getDriver();
    }

    public void LaunchApplication() {
        driver.get("https://test.xaquaudp.io/");
        System.out.println("Test Started.");
        assert driver.getTitle().contains("Xaqua UDP");
    }

    public void enterUsername(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void enterPassword(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void clickButton(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void verifyElement(String locator, String value) {
        WebElement logo = driver.findElement(By.xpath(locator));
        if (logo.isDisplayed()) {
            System.out.println("Element present on screen");
        } else {
            String elementText = logo.getText();
            assert elementText.equals(value);
        }
    }
}
