package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

;


public class LoginPage {
    private WebDriver driver;
    private By userField = By.id("username");
    private By passField = By.id("password");
    private By loginbutton=By.cssSelector("#login button");

    public  LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(userField).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(passField).sendKeys(password);
    }

    public SecureAreaPage clickLoginbutton() {
      driver.findElement(loginbutton).click();
      return new SecureAreaPage(driver);
    }
}
