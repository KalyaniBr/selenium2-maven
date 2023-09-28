package Module2_LoginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass3;
import LibraryFiles.UtilityClass3;
import Module1_Login.SwagLabLoginPage3;
import Module2_Home.SwagLabHomePage3;
import Module3_Menu.SwagLabMenuPage3;

public class SwagLabLoginTest3 extends BaseClass3
{

	SwagLabLoginPage3 login;
	SwagLabHomePage3 home;
	SwagLabMenuPage3 Menu;
	   int TCID;

	   @BeforeClass
	   public void OpebBrowser() throws IOException
	   {
		   initializeBrowser();
		   login=new SwagLabLoginPage3(driver);
		   home=new SwagLabHomePage3(driver);
		   Menu=new SwagLabMenuPage3(driver);
	   }
	@BeforeMethod
	public void LoginApp() throws IOException, InterruptedException
	{
		login.SwagLabLoginPage3username(UtilityClass3.readDataFromPF("UN"));
		login.SwagLabLoginPage3password(UtilityClass3.readDataFromPF("PWD"));
		login.SwagLabLoginPage3ClickLoginBtn();
		Thread.sleep(3000);
	}
	@Test
	public void verifyLogo()
	{
		TCID=101;
		boolean result=home.SwagLabHomePage3verifyLogo();
		Assert.assertTrue(result,"Failed:result is false");
		
			}
	  @Test
	  public void AddToCartConvertToRemove() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  TCID=102;
		  home.SwagLabHomePage3AddToCart();
		   String expText =UtilityClass3.getTD(1, 0);
		String actText = home.SwagLabHomePage3Remove();
		Assert.assertEquals(actText, expText,"Failed102:both results are diff");
	  }
	  
	  @AfterMethod
	  public void LogoutApp( ITestResult s1) throws IOException, InterruptedException
	  {
		  if(s1.getStatus()==ITestResult.FAILURE);
		  {
			  UtilityClass3.captureSS(driver, TCID);
		  }
		  home.SwagLabHomePage3clickMenuBtn();
		  Thread.sleep(3000);
		  Menu.SwagLabMenuPage3clickLogout();
		  Thread.sleep(3000);
	  }
	  @AfterClass
	  public void closeBrowser()
	  {
		  driver.close();
	  }
}
