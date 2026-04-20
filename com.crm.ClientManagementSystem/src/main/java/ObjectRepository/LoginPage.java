package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(name = "user_name")
	private WebElement untbx;
	
	
	@FindBy(name = "user_password")
	private WebElement pwtbx;
	
	
	@FindBy(id = "submitButton")
	private WebElement lgbtx;
	
	/*@FindBy(xpath = "//a[text()='vtiger']")
	private WebElement image;
	
	@FindBy(xpath = "//div[text()='Powered by vtiger CRM - 5.4.0']")
	private WebElement text;
	*/
	
	//insilization
	public LoginPage(WebDriver d) {
		PageFactory.initElements(d,this);


}
      //utilization

	public WebElement getUntbx() {
		return untbx;
	}


	public WebElement getPwtbx() {
		return pwtbx;
	}


	public WebElement getLgbtx() {
		return lgbtx;
	}

	/*public WebElement getImage() {
		return image;
	}

	public WebElement getText() {
		return text;
	}
	*/
	//Bussiness logic
	public void logintocms(WebDriver d,String username,String pwd){
		LoginPage lp=new LoginPage(d);
		lp.getUntbx().sendKeys(username);
		lp.getPwtbx().sendKeys(pwd);
		lp.getLgbtx().click();
		

	}
	
	

	
}
