@smoke
Feature: Verify user credentials with valid and invalid Data 

Scenario Outline: Login with valid user details 
	Given User is in Login Page with given url "https://www.flipkart.com/" 
	When User enters "<Username>" 
	And User enters and "<Password>" 
	And user click on Login button 
	Then user can able to navigate homepage 
	And Logout from application 
	
	Examples: 
		|Username|Password|
		|nandishc057@gmail.com|nandishc1990|

		
Scenario Outline: Login with Invalid user details 
	Given User is in Login Page with given url "https://www.flipkart.com/" 
	When User enters invalid username "<Username>" 
	And User enters invalid password "<Password>" 
	And user click on Login button 
	Then User can see error message 
	And User cant able to login 
	
	Examples: 
		|Username|Password|
		|a1c23|a4c56|

		
