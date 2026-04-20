package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ClientManagementSystem.GenericLibrary.SeliniumUtility;

public class ContactPage{
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contact;
	
	@FindBy (xpath  ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusicon;
	
	
	@FindBy(name = "salutationtype")
	private WebElement dropdown1;
	
	@FindBy(name = "selected_id")
	private WebElement select;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "account_name")
	private WebElement orgname;
	
	@FindBy(id = "title")
	private WebElement title;
	
	
	@FindBy(id = "department")
	private WebElement dept;
	
	
    @FindBy(id = "mailingstate")
	private WebElement mallingstate;
	
    @FindBy(id = "otherstate")
    private WebElement otherstate;
    
    @FindBy(id = "mailingcity")
	private WebElement mallingcity;
	
	
	@FindBy(id = "othercity")
	private WebElement othercity;
	
	
	@FindBy(id = "mailingcountry")
	private WebElement mallingcountry;
	
	
	@FindBy(id = "othercountry")
	private WebElement othercountry;
	
	
	@FindBy(name = "description")
	private WebElement desp;
    @FindBy(name = "button")
    private WebElement save;
    
    @FindBy(xpath = "(//input[@class='crmbutton small delete'])[2]")
    private WebElement delete;
	
    @FindBy(name = "assigned_user_id")
	private WebElement admin;
	
	public ContactPage(WebDriver d) {
		PageFactory.initElements(d,this);
	}


	public WebElement getContact() {
		return contact;
	}


	public WebElement getPlusicon() {
		return plusicon;
	}


	public WebElement getDropdown1() {
		return dropdown1;
	}


	public WebElement getLastname() {
		return lastname;
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


	public WebElement getMallingstate() {
		return mallingstate;
	}


	public WebElement getOtherstate() {
		return otherstate;
	}


	public WebElement getMallingcity() {
		return mallingcity;
	}


	public WebElement getOthercity() {
		return othercity;
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
	
	
	
	public WebElement getSave() {
		return save;
	}
	
	


	public WebElement getSelect() {
		return select;
	}
	


	public WebElement getDelete() {
		return delete;
	}
	
	


	public WebElement getAdmin() {
		return admin;
	}


	public void createcontact(WebDriver d,String key,String lastname,String orgname,String title,String dept,String mallingstate,String otherstate,String mallingcity,String othercity,String mallingcountry,String othercountry,String desp ) {
		ContactPage cp=new ContactPage(d);
		WebElement address = cp.getAdmin();
		SeliniumUtility s=new SeliniumUtility();
		s.handledropdownByVisibletext(address, key);
		
		cp.getLastname().sendKeys(lastname);
		cp.getOrgname().sendKeys(orgname);
		cp.getTitle().sendKeys(title);
		cp.getDept().sendKeys(dept);
		cp.getMallingstate().sendKeys(mallingstate);
		cp.getOtherstate().sendKeys(otherstate);
		cp.getMallingcity().sendKeys(mallingcity);
		cp.getOthercity().sendKeys(othercity);
		cp.getMallingcountry().sendKeys(mallingcountry);
		cp.getOthercountry().sendKeys(othercountry);
		cp.getDesp().sendKeys(desp);
		cp.getSave().click();
	}

	

	
	
	
	
	

}
