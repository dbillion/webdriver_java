package base2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages2.Homepage;

import java.util.List;

public class BaseTest1 {

    private WebDriver driver;
    protected Homepage homePage;

    @BeforeClass
    public void setUp() {
       System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get(" https://the-internet.herokuapp.com/");
       homePage=new Homepage(driver);


    }

    @AfterClass
    public void tearDown() {
        driver.quit();}


}
