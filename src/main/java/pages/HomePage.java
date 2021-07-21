package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {

    @FindBy (xpath = ".//*[@class='pull-left image']")
    WebElement avatarLogo;

    @FindBy (id = "spares")
    WebElement subMenuSpase;


    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    @Step
    public boolean isAvatarDisplayed(){
        return actionsWithOurElements.isElementDisplayed(avatarLogo);
//        try {
//        return webDriver.findElement(By.xpath(".//*[@class='pull-left image']")).isDisplayed();
//        } catch (Exception e){
//        return false;
//        }
    }

    public void clickOnSubMenuSpare() {
        actionsWithOurElements.clickOnElement(subMenuSpase);
    }
}


