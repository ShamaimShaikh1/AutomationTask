Feature: Login

Scenario: Successful Login with valid credentials
	Given User Launch Chrome browser
	When User open URL "https://www.saucedemo.com/"
	And User enters Username as "standard_user" and Password as "secret_sauce"
	And Clicks on Login
	Then User should route to Page "https://www.saucedemo.com/inventory.html"
	
	
Scenario: Login with invalid credentials
	Given User Launch Chrome browser
	When User open URL "https://www.saucedemo.com/"
	And User enters Username as "standard_user" and Password as "1134ffgh"
	And Clicks on Login
	Then User should route to Page "https://www.saucedemo.com/"		