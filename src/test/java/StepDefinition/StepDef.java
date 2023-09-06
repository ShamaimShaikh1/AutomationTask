package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.FilterItems;
import PageObject.LoginPage;
import PageObject.Logout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginPg;
	public Logout logOutPg;
	public FilterItems Filter;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(option);
	    
	    loginPg = new LoginPage(driver);
	    logOutPg = new Logout(driver);
	    Filter = new FilterItems(driver);
	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
	     driver.get(url);   
	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
	     loginPg.enterUsername(username);
	     loginPg.enterPassword(password);
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
		loginPg.ClickLoginBtn();
	}

	@Then("User should route to Page {string}")
	public void user_should_route_to_page(String expectedUrl) {
	    String actualUrl = driver.getCurrentUrl();
	    
	    if(actualUrl.equals(expectedUrl))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}
	
	@When("User clicks on Menu button")
	public void User_clicks_on_Menu_button()
	{
		logOutPg.ClickMenu();
	}
	
	@When("User clicks on Logout link")
	public void User_clicks_on_Logout_link(){
		logOutPg.ClickMenu();
		logOutPg.ClickLogOutBtn();
	}
	
	//filter
	@When("User clicks on filter option")
	public void User_clicks_on_filter_option()
	{
		Filter.ClickMenu();
	}
	
	@When("User selects Name (Z-A)")
	public void User_selects_Name_ZA()
	{
		Filter.ClickOpt();
	}
}
