Feature: Application login 

Background: User should be logged into the application
	Given Application is opened 
	When username and password is provided 
	Then User is logged in

@regression
Scenario: change password
	Given user is on change password page
	When user gives a new password 
	Then User is able to change the password 
	
@smoke	
Scenario: change the profile picture 
	Given user is on Account page
	When user selects an image 
	Then User is able to change the profile picture 
	
@smoke	
Scenario: Send a friend request 
	Given user is on profile page 
	When user selects a name 
	Then User is able to send a friend request 

Scenario: Deactivate the account
	Given user is on Account page
	When user clicks on deactivate button
	Then User is able to deactivate the account
	
	
	
