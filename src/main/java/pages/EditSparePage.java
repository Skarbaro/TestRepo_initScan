package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditSparePage extends ParentPage{
    @FindBy(id = "spares_spareName")
    private WebElement spareNameInput;

    @FindBy(id = "spares_spareType")
    private WebElement spareTypeDD;

    @FindBy(name = "delete")
    private WebElement buttonDelete;

    @FindBy(name = "add")
    private WebElement buttonAdd;

    public EditSparePage(WebDriver webDriver){
        super (webDriver, "/dictionary/spares/edit");
    }

    public boolean checkSpareNameInInput (String spareName){        // Получить текст и сравнить с тем который ищем
        return spareNameInput.getAttribute("value").equals(spareName);
    }

    public void clickButtonDelete(){
        actionsWithOurElements.clickOnElement(buttonDelete);
    }
	
	public void enterSpareNameInToInput(String spareName) {
        actionsWithOurElements.enterTextInToElement(spareNameInput, spareName);
    }
}