Feature: Facebook login 

Scenario: Facebook login with email id 
	Given Browser is opened and application is launched 
	When username and password is provided for multiple login 
		|aish.ingale@gmail.com|Rutu@2020|
		|9890510755|Rutu@2020|
	Then User is able to login with mobile and email