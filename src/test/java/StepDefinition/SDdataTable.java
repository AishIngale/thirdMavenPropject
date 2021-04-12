package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Method;

public class SDdataTable extends commonFile {
	WebDriver driver=getDriver();
	
	
	@When("username and password is provided for multiple login")
	public void username_and_password_is_provided_for_multiple_login(DataTable dataTable) throws Exception {
		String username, password;
		List<List<String>> dataList = dataTable.asLists();
		for (List<String> d1 : dataList) {
			username = d1.get(0);
			password = d1.get(1);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(username);
			driver.findElement(By.xpath("//input[contains(@id,'pass')]")).clear();
			driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
			System.out.println("Mobile number and password is entered");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
			Actions a = new Actions(driver);
			a.sendKeys(Keys.ESCAPE).build().perform();
			a.sendKeys(Keys.ESCAPE).build().perform();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Aishwarya']")));

			if (driver.findElement(By.xpath("//span[text()='Aishwarya']")).isDisplayed()) {
				System.out.println("element is visible");
			}
			
			String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
			TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
			
			System.out.println("User is able to login with" + username);
			driver.findElement(By.xpath("//div[@role='main']")).click();
			driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
			System.out.println("user is able to logout");
			// driver.close();
		}
	}

	@Then("^User is able to login with mobile and email$")
	public void user_is_able_to_login_with_mobile_and_email() throws Throwable {

		System.out.println("User is able to login with both email id and mobile number");
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
}
