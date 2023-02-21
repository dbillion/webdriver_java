package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Homepage {
    private WebDriver driver;
    private By formauthenticationLink = By.linkText("Form Authentication");
    public Homepage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormAuthentication( ) {
     clickLink("Form Authentication");
     return new LoginPage(driver);
    }

    public DropDownPage clickDropDown( ) {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
