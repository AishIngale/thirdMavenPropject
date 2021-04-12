package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@regression")
	public void beforeValidation() {
		System.out.println("Hook - before validation - regression");
	}
	
	@After("@regression")
	public void afterValidation() {
		System.out.println("Hook - after validation - regression");
	}
	
	@Before("@smoke")
	public void beforeValidationsmoke() {
		System.out.println("Hook - before validation-smoke");
	}
	
	@After("@smoke")
	public void afterValidationsmoke() {
		System.out.println("Hook - after validation - smoke");
	}
}
