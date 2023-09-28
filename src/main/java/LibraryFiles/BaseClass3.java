package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass3 {

	public WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		driver= new ChromeDriver();
		driver.get(UtilityClass3.readDataFromPF("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	
	
}
