package base2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages2.Homepage;

import java.util.List;

public class BaseTestwild {

    private WebDriver driver;
    protected Homepage homepage;

    public void setUp() {
       System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get(" https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375,812));
       List<WebElement>links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();
        WebElement nextpage= driver.findElement(By.linkText("Example 1: Menu Element"));
        nextpage.click();
       List <WebElement> finallinkcounter = driver.findElements(By.tagName("a"));
        System.out.println(finallinkcounter.size());
        System.out.println(driver.getTitle());
//        driver.quit();
    }

    public static void main(String[] args) {
        BaseTestwild test = new BaseTestwild();
        test.setUp();
    }
}
