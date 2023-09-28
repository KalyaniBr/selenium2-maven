package Module3_Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage3 {
 @FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement Logout;

 public SwagLabMenuPage3(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
 public void SwagLabMenuPage3clickLogout()
 {
	 Logout.click();
 }
 
 
}
