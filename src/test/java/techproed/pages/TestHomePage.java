package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestHomePage {
    public TestHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'You logged into a secure area!')]") //contains(text() kullandık cunku textin basında bosluklar vardı,sıkıntı olmasın diye
    public WebElement loginMessage;
}
