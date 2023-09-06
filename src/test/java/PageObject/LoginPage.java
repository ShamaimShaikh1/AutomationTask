package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

 WebDriver ldriver;

 public LoginPage(WebDriver rDriver)
  {
	ldriver=rDriver;
	PageFactory.initElements(rDriver, this);
  }

 @FindBy(id = "user-name")
 WebElement username;
 
 @FindBy(id = "password")
 WebElement password;
 
 @FindBy(id = "login-button")
 WebElement loginBtn;
 
 public void enterUsername(String UName)
 {
	 username.sendKeys(UName);
 } 
 
 public void enterPassword(String Pass)
 {
	 password.sendKeys(Pass);
 } 
 
 public void ClickLoginBtn()
 {
	 loginBtn.click();
 } 
 
}
