Feature: Logout

Scenario: Logout after login
	Given User Launch Chrome browser
	When User open URL "https://www.saucedemo.com/"
	And User enters Username as "standard_user" and Password as "secret_sauce"
	And Clicks on Login
	Then User should route to Page "https://www.saucedemo.com/inventory.html"
	When User clicks on Menu button
	And User clicks on Logout link
	Then User should route to Page "https://www.saucedemo.com/"
