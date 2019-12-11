Feature: Verify user credentials with valid  
@smoke
Scenario Outline: Login with valid user details 
	Given User is in Login Page with given url "https://www.flipkart.com/" 
	When User enters "<Username>" 
	And User enters and "<Password>" 
	And user click on Login button 
	Then user can able to navigate homepage 
	And Logout from application 
	
	Examples: 
		|Username|Password|
		|madhuk046@gmail.com|nandishc1990|