package StepDefinition;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition extends commonFile {
	WebDriver driver;
	
	
	@Given("Browser is opened and application is launched")
	public void browser_is_opened_and_application_is_launched()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	//	extent.createTest(nameofCurrMethod);
		driver=getDriver();
		System.out.println("Browser is opened and Facebook login page is opened");
		reportingMethod();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}

	@When("username {string} and password {string} is provided")
	public void username_and_password_is_provided(String username, String password) throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		driver=getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
		System.out.println("Mobile number and password is entered");
		
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}

	@SuppressWarnings("deprecation")
	@When("^Mobile number and password is provided$")
	public void mobile_number_and_password_is_provided() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("aish.ingale@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("wh@t1234ghrce");
		System.out.println("Mobile number and password is entered");
		
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}

	@SuppressWarnings("deprecation")
	@Then("^User is able to login$")
	public void user_is_able_to_login() throws Throwable {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();//extent.createTest(nameofCurrMethod);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@aria-label='Account'][@role='button']")));
				//visibilityOfAllElementsLocatedBy(By.xpath("//div[@aria-label='Account']")));
		if (driver.findElement(By.xpath("//div[@aria-label='Account'][@role='button']")).isDisplayed()) {
			System.out.println("User is logged in");
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Account'][@role='button']")).click();
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Log Out')]")));
		
		Thread.sleep(5000);
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
		if (driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).isDisplayed()) {
			driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();

		}
				

	}
	
	@Given("Application is opened")
	public void application_is_opened() throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
	    System.out.println("Method - Application is opened");
	    
		
	}

	@When("username and password is provided")
	public void username_and_password_is_provided() throws Exception {
		
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();//extent.createTest(nameofCurrMethod);
	    System.out.println("Method - User has provided username and password");
	   // String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	@Then("User is logged in")
	public void user_is_logged_in() throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();//extent.createTest(nameofCurrMethod);
	    System.out.println("Method - User is logged in ");
	    //String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	@Given("user is on change password page")
	public void user_is_on_change_password_page() throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();//extent.createTest(nameofCurrMethod);
		System.out.println("Method - User has changed password");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	@When("user gives a new password")
	public void user_gives_a_new_password() throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - user has given a new password");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	@Then("User is able to change the password")
	public void user_is_able_to_change_the_password()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - User is able to change the password");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}

	@Given("user is on Account page")
	public void user_is_on_account_page() throws Exception {
		
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
		System.out.println("Method - user is on Account page");
	}

	@When("user selects an image")
	public void user_selects_an_image()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - user selects an image");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	@Then("User is able to change the profile picture")
	public void user_is_able_to_change_the_profile_picture()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
	//	extent.createTest(nameofCurrMethod);
		System.out.println("Method - User is able to change the profile picture");
		
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	
	@Given("user is on profile page")
	public void user_is_on_profile_page()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
	    System.out.println("Method - user is on profile page");
	   // String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}

	@When("user selects a name")
	public void user_selects_a_name()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - user selects a name");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
	}
	
	@Then("User is able to send a friend request")
	public void user_is_able_to_send_a_friend_request()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		reportingMethod();
		extent.createTest(nameofCurrMethod);
		System.out.println("Method - User is able to send a friend request");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
		extent.flush();
	}

	@When("user clicks on deactivate button")
	public void user_clicks_on_deactivate_button()throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - user clicks on deactivate button");
		//String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
		
	}
	@Then("User is able to deactivate the account")
	public void user_is_able_to_deactivate_the_account() throws Exception {
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		//reportingMethod();
		
		//extent.createTest(nameofCurrMethod);
		System.out.println("Method - User is able to deactivate the account");
		
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);
		//extent.flush();
	}


}
