package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact_page {
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy (xpath  ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;
	
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contact;
	
	
	@FindBy(name = "salutationtype")
	private WebElement salu;
	
	@FindBy(name = "assigned_user_id")
	private WebElement admin;
	
	@FindBy(name = "account_name")
	private WebElement orgname;
	
	@FindBy(id = "title")
	private WebElement title;
	
	
	@FindBy(id = "department")
	private WebElement dept;
	
	
	
	@FindBy(name = "assigned_user_id")
	private WebElement addmindrop;
	
	@FindBy(name = "mailingstreet")
	private WebElement mallingstreet;
	
	
	@FindBy(name = "otherstreet")
	private WebElement otherstreet;
	
	
	@FindBy(id = "mailingcity")
	private WebElement mallingcity;
	
	
	@FindBy(id = "othercity")
	private WebElement othercity;
	
	
	@FindBy(id = "mailingstate")
	
	private WebElement mallingstate;
	
	@FindBy(id = "otherstate")
	private WebElement otherstate;
	
	
	@FindBy(id = "mailingcountry")
	private WebElement mallingcountry;
	
	
	@FindBy(id = "othercountry")
	private WebElement othercountry;
	
	
	@FindBy(name = "description")
	private WebElement desp;
	
	public contact_page(WebDriver d) {
		PageFactory.initElements(d,this);
	}

	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getSalu() {
		return salu;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDept() {
		return dept;
	}

	public WebElement getAddmindrop() {
		return addmindrop;
	}

	public WebElement getMallingstreet() {
		return mallingstreet;
	}

	public WebElement getOtherstreet() {
		return otherstreet;
	}

	public WebElement getMallingcity() {
		return mallingcity;
	}

	public WebElement getOthercity() {
		return othercity;
	}

	public WebElement getMallingstate() {
		return mallingstate;
	}

	public WebElement getOtherstate() {
		return otherstate;
	}

	public WebElement getMallingcountry() {
		return mallingcountry;
	}

	public WebElement getOthercountry() {
		return othercountry;
	}

	public WebElement getDesp() {
		return desp;
	}

	public WebElement getPlusicon() {
		return plusicon;
	}

		public WebElement getContact() {
		return contact;
	}

		public WebElement getAdmin() {
			return admin;
		}
		
		
	
	
	
	
	
	
	
	
	
	
	




}
