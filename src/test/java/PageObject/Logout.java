package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	 WebDriver ldriver;

	 public Logout(WebDriver rDriver)
	  {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	  }

	 @FindBy(id = "react-burger-menu-btn")
	 WebElement menu;
	 
	 @FindBy(id = "bm-menu-wrap")
	 WebElement wrap;
	 
	 //@FindBy(xpath = "//a [@ class='bm-item menu-item']")
	 @FindBy(id = "logout_sidebar_link" )
	 WebElement logout;
	 
	 
	 public void ClickMenu()
	 {
		menu.click();	 
	 }
	 
	 public void ClickLogOutBtn()
	 {
		 wrap.click();
		 logout.click();
	 }
}
