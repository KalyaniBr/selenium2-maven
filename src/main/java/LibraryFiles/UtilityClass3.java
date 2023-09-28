package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.w3c.dom.events.EventException;

public class UtilityClass3 {


	public static String getTD(int rowIndex,int collIndex) throws EventException, IOException
	 {
		 FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Seleniun2_Maven\\TestData\\Selenium.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
		String Value= sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		return Value;
	 }
	
	 public static void captureSS(WebDriver driver, int TCID) throws IOException
	 { 
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\jayas\\eclipse-workspace\\Seleniun2_Maven\\Screenshots"+TCID+".jpg");
		 FileHandler.copy(src, dest);
	 }
	 
	 public static String readDataFromPF(String Key) throws IOException
	 {
		 FileInputStream file=new FileInputStream("C:\\Users\\jayas\\eclipse-workspace\\Seleniun2_Maven\\PropertyFile\\Property File.properties");
		 Properties p=new Properties();
		 p.load(file);
		 
		String value=p.getProperty(Key) ;
		 return value;
	 }
	 
	 
	 
}
