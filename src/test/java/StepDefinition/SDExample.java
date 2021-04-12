package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;

public class SDExample extends commonFile {
	WebDriver driver=getDriver();
	
	@When("^username (.+) and password (.+) is provided using example method$")
    public void username_and_password_is_provided_using_example_method(String username, String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(password);
		System.out.println(username+" and password is entered");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		a.sendKeys(Keys.ESCAPE).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Aishwarya']")));
		String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
		TakeScreenshots.testBStackTakeScreenShot(nameofCurrMethod);

		if (driver.findElement(By.xpath("//span[text()='Aishwarya']")).isDisplayed()) {
			System.out.println("element is visible");
		}
		System.out.println("User is able to login with" + username);
		driver.findElement(By.xpath("//div[@role='main']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		System.out.println("user is able to logout");
	}
}
