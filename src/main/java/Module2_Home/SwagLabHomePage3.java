package Module2_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage3 {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement LOGO;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement Menu;
	@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
	
	public SwagLabHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean SwagLabHomePage3verifyLogo()
	{
		boolean result =LOGO.isDisplayed();
		return result;
	}
	public void SwagLabHomePage3AddToCart()
	{
		AddToCart.click();
	}
	public void SwagLabHomePage3clickMenuBtn()
	{
		Menu.click();
	}
	public String SwagLabHomePage3Remove()
	{
		String actText=Remove.getText();
		return actText;
	}
	
	
}
