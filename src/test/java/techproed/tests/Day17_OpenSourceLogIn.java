package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day17_OpenSourceLogIn {
    /*
    POM:
    1. Locate the page object in the pages package
    -username
    -password
    -button
    Note: Use constructor to instantiate page objects
    2. In test class, create page object to access the objects in the page class
     */
    @Test
    public void loginTest(){
//        page object'i olustur
        OpenSourcePage openSourcePage = new OpenSourcePage();

//      Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("open_source_URL"));

//      Bu classta olusturdugumuz objecti kullanarak objeyi cagırdıgımız classdaki(OpenSourcePage) objelere ulas
        openSourcePage.userName.sendKeys("Admin");
        openSourcePage.password.sendKeys("admin123");
        openSourcePage.submitButton.click();


        Driver.closeDriver();

    }


}
