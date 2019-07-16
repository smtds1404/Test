Feature: Free CRM login Feature
	Scenario: Free CRM login Test Scenario
	Given User is already on login page
	When title of login page is Free CRM  
	Then User enters username 
	And User enters password
	And User clicks on login button
	And User is on home page
	
	