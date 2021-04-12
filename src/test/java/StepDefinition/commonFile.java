package StepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class commonFile {
	
	
	protected static WebDriver driver;
	public static Properties prop;
	static ExtentReports extent;
	public static void reportingMethod() {
		String path=System.getProperty("user.dir")+"\\Reports\\extentReport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Automation Results");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		
		System.out.println("made changes");
	}
	
	protected static WebDriver getDriver(){
	
			if (driver == null) {
			Map<String, Object> prefs = new HashMap<String, Object>();

			//add key and value to map as follow to switch off browser notification
			//Pass the argument 1 to allow and 2 to block
			prefs.put("profile.default_content_setting_values.notifications", 2);

			//Create an instance of ChromeOptions 
			ChromeOptions options = new ChromeOptions();

			// set ExperimentalOption - prefs 
			options.setExperimentalOption("prefs", prefs);
			 prop=new Properties();
			 FileInputStream fis;
			try {
				fis = new FileInputStream("C:/Users/user/thirdmavenproject/global.properties");
				 prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriver"));
			
			//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver 
			//which will switch off this browser notification on the chrome browser
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			extent.flush();
		}
		return driver;
	}

}
