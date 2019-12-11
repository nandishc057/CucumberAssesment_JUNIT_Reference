Feature: Launch given URL and Verify the title 

@E2E
Scenario: Launch URL and Verify Title
	Given Navigate with given url "https://www.flipkart.com/" 
	When   application is openned 
	Then   Close any child Browser is opened 
	And    Verify title 
