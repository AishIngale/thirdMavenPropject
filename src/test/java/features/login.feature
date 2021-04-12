Feature: Application login 

Scenario: ScenarioOne Facebook login with mobile number  
	Given Browser is opened and application is launched 
	When username "9890510755" and password "Rutu@2020" is provided 
	Then User is able to login 
	
Scenario: ScenarioTwo Facebook login with email id 
	Given Browser is opened and application is launched 
	When username "aish.ingale@gmail.com" and password "Rutu@2020" is provided 
	Then User is able to login 
	
Scenario Outline: ScenarioThree Facebook login 
	Given Browser is opened and application is launched 
	When username <Username> and password <Password> is provided using example method 
	Then User is able to login with mobile and email 
	
	Examples: 
		|Username|Password|
		|aish.ingale@gmail.com|Rutu@2020|
		|9890510755|Rutu@2020|
		
Scenario: ScenarioFour Facebook login with email id 
	Given Browser is opened and application is launched 
	When username and password is provided for multiple login 
		|aish.ingale@gmail.com|Rutu@2020|
		|9890510755|Rutu@2020|
	Then User is able to login with mobile and email 
	
	
	
