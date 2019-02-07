package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import WebPages.HomePage;
import interfaceImplementation.ImpDriver;
import interfaces.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Base {
	private static WebDriver driver;
	public HomePage HomePageobj;
	public Driver driverobj;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeClass
	public void InitializeDriver() 
	{
		try{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Ankita\\workspace\\QAclickacademy\\src\\main\\java\\resources\\data.properties");
		
			prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ankita\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ankita\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("Internet Explorer")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Ankita\\Downloads\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else {
			throw new Exception("Invalid Browser Name" + browserName);
		}
		driverobj = new ImpDriver(driver);
		String url = prop.getProperty("url");
		
		driverobj.openBrowser(url);
		log.info("Browser opened");
		HomePageobj= new HomePage(driver);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

@AfterClass
public void closebrowser()
{
	try {
		
		driverobj.closeAllBrowser();
		log.info("All browser closed");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void screenshot(String result) throws IOException
	{
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C://Users//Ankita//workspace//QAclickacademy//Screenshots//"+result+"screenshot.png"));
	}
}


