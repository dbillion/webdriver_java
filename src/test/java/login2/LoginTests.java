package login2;
import  base2.BaseTest1;
import org.testng.annotations.Test;
import pages2.LoginPage;
import pages2.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest1 {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginPage.clickLoginbutton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!") ,"Alert text is incorrect");
    }
}
