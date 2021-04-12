Feature: Facebook login 

Scenario Outline: Facebook login 
	Given Browser is opened and application is launched 
	When username <Username> and password <Password> is provided using example method 
	Then User is able to login with mobile and email 
	
	Examples: 
		|Username|Password|
		|aish.ingale@gmail.com|Rutu@2020|
		|9890510755|Rutu@2020|