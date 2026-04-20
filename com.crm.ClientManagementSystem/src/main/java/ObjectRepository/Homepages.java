package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepages {
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement profile;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calenderlink;
	
	@FindBy(xpath="//a[text()='Leads']/parent::td[@class='tabUnSelected']")
	private WebElement leadslink;
	
	
	@FindBy(xpath="//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement orgelement;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactelement;
	
	@FindBy(xpath="//a[text()='Opportunities']/parent::td[@class='tabUnSelected']")
	private WebElement pooprtuinitylink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productlink;
	
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documentlink;
	
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement emailLink;
	
	
	@FindBy(xpath="//a[text()='Trouble Tickets']/parent::td[@class='tabUnSelected']")
	private WebElement TroubleTicketlink;
	
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboard;
	
	
	
	//insilization
	public Homepages(WebDriver d) {
		PageFactory.initElements(d,this);

		
	
	

}
	//utilization


	public WebElement getProfile() {
		return profile;
	}


	public WebElement getSignout() {
		return signout;
	}


	public WebElement getCalenderlink() {
		return calenderlink;
	}


	public WebElement getLeadslink() {
		return leadslink;
	}


	public WebElement getOrgelement() {
		return orgelement;
	}
	


	public WebElement getContactelement() {
		return contactelement;
	}


	public WebElement getPooprtuinitylink() {
		return pooprtuinitylink;
	}
}