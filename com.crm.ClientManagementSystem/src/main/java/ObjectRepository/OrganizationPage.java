package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ClientManagementSystem.GenericLibrary.SeliniumUtility;
//declaration
public class OrganizationPage {
	@FindBy (xpath  ="//img[@alt='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name = "accountname")
	private WebElement orgname;
	
	@FindBy(xpath  = "(//input[@type='text'])[11]")
	private WebElement email;
	
	@FindBy(name = "industry")
	private WebElement industrydrop;
	
	@FindBy(name = "accounttype")
	private WebElement typedrop;
	
	@FindBy(name = "assigntype")
	private WebElement radiogroup;
	
	@FindBy(name = "bill_street")
	private WebElement billaddress;
	
	@FindBy(name="ship_street")
	private WebElement shipaddress;
	
	@FindBy(id = "bill_city")
	private WebElement billcity;
	
	@FindBy(id = "ship_city")
	private WebElement shipcity;
	
	@FindBy(id = "bill_state")
	private WebElement billstate;
	
	@FindBy(id = "ship_state")
	private WebElement shipstate;
	
	
	@FindBy(id = "bill_country")
	private WebElement billcountry;
	
	@FindBy(id = "ship_country")
	private WebElement shipcountry;
	
	@FindBy(name = "description")
	private WebElement desp;
	
	@FindBy(name = "button")
	private WebElement savebtn;
	
	
	//insilization
	
	
	
	public OrganizationPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	//utilization

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getIndustrydrop() {
		return industrydrop;
	}

	public WebElement getTypedrop() {
		return typedrop;
	}

	public WebElement getRadiogroup() {
		return radiogroup;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getShipaddress() {
		return shipaddress;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getShipcity() {
		return shipcity;
	}

	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getShipstate() {
		return shipstate;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getShipcountry() {
		return shipcountry;
	}

	public WebElement getDesp() {
		return desp;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}

	
	//Bussiness logic
	
	public void createorganization(WebDriver d,String orgname,String email,String text,String billaddress,String shipaddress,String billcity,String shipcity,String billstate,String shipstate,String billcountry,String shipcountry,String desp) {
		OrganizationPage op=new OrganizationPage(d);
		op.getOrgname().sendKeys(orgname);
		op.getEmail().sendKeys(email);
		WebElement address = op.getIndustrydrop();
		SeliniumUtility s=new SeliniumUtility();
		s.handledropdownByVisibletext(address, text);
		op.getBilladdress().sendKeys(billaddress);
		op.getShipaddress().sendKeys(shipaddress);
		op.getBillcity().sendKeys(billcity);
		op.getShipcity().sendKeys(shipcity);
		op.getBillstate().sendKeys(billstate);
		op.getShipstate().sendKeys(shipstate);
		op.getBillcountry().sendKeys(billcountry);
		op.getShipcountry().sendKeys(shipcountry);
		op.getDesp().sendKeys(desp);
	}
	
	

}
