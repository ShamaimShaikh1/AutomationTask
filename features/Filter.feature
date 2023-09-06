Feature: Filter 

Scenario: User filter products by Name (Z-A)
	Given User Launch Chrome browser
	When User open URL "https://www.saucedemo.com/"
	And User enters Username as "standard_user" and Password as "secret_sauce"
	And Clicks on Login
	And User clicks on filter option
	And User selects Name (ZA)
	Then User should see products by Name ZA
	