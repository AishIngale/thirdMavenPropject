package StepDefinition;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshots extends commonFile{
	@Test
	public static void testBStackTakeScreenShot(String methodName) throws Exception {

		WebDriver driver;
		driver = getDriver();
		//goto url
		//Call take screenshot function
		String fileLocation= "C://thirdmavenproject//Screenshots//"+methodName+System.currentTimeMillis()+".png";
		TakeScreenshots.takeSnapShot(driver, fileLocation);
	}
	/**
	 * This function will take screenshot
	 * 
	 * @param webdriver
	 * @param fileWithPath
	 * @throws Exception
	 */
	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile = new File(fileWithPath);
        //Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
}