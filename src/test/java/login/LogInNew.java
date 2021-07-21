package login;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import parenTest.ParentTest;

public class LogInNew extends ParentTest {

    @Test
    public void validLogin(){
        loginPage.openLoginPage();
        loginPage.enterLogin("Student");
        loginPage.enterPassWord("909090");
        loginPage.clickButtonVhod();

        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
//        Assert.assertTrue("Avatar is not present", homePage.isAvatarDisplayed());  // valid
    }

    @Test
    public void noValidLogin(){
        loginPage.openLoginPage();
        loginPage.enterLogin("Student");
        loginPage.enterPassWord("9090090");
        loginPage.clickButtonVhod();

        checkExpectedResult("Button is not present", loginPage.isButtonVhodDisplayed(),false);
//        Assert.assertTrue("Button is not present", loginPage.isButtonVhodDisplayed());
//        Assert.assertFalse("Avatar is not present", homePage.isAvatarDisplayed()); // not valid
    }

    @Test
    @Ignore
    public void validLogin2(){
        loginPage.validLoginInToApp();
        checkExpectedResult("Avatar is not present", homePage.isAvatarDisplayed());
//        Assert.assertTrue("Avatar is not present", homePage.isAvatarDisplayed());  // valid
    }

}
