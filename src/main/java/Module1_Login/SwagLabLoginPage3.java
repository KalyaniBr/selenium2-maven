package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage3 {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
	
	public SwagLabLoginPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void SwagLabLoginPage3username(String UNValue)
	{
		UN.sendKeys(UNValue);
	}
	public void SwagLabLoginPage3password(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}
	public void SwagLabLoginPage3ClickLoginBtn()
	{
		Login.click();
	}
}
