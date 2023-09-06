package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterItems {

	WebDriver ldriver;

	 public FilterItems(WebDriver rDriver)
	  {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	  }
	 
	 @FindBy(xpath = "//select [@class = 'product_sort_container']")
	 WebElement filterMenu;
	 
	 @FindBy(xpath="//option [text() = 'Name (Z to A)']")
	 WebElement filterZA;
	 
	 public void ClickMenu()
	 {
		 filterMenu.click();	 
	 }
	 
	 public void ClickOpt()
	 {
		 filterZA.click();	 
	 }
	 
}
