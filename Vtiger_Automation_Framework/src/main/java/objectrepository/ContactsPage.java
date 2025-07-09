package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createAccountButton;
	
	@FindBy(xpath = "//img[@alt='Search in Contacts...']")
	private WebElement searchIcon;
	
	@FindBy(xpath = "//a[text()='edit']")
	private WebElement editLink;
	
	@FindBy(xpath = "//a[text()='del']")
	private WebElement deleteLink;
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement selectButton;
	
	@FindBy(xpath = "(//input[@title='Clear'])[1]")
	private WebElement clearButton;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceTextField;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//input[@name='department']")
	private WebElement departmentTextField;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerText;
	
	

	
	
	
	
	
	@FindBy(xpath = "(//input[@value='Cancel  '])[1]")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//a[text()='Amazon96']")
	private WebElement organizationNameLink;
	
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}


	public WebElement getSearchIcon() {
		return searchIcon;
	}


	public WebElement getEditLink() {
		return editLink;
	}


	public WebElement getDeleteLink() {
		return deleteLink;
	}


	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}


	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}


	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}


	public WebElement getSelectButton() {
		return selectButton;
	}


	public WebElement getClearButton() {
		return clearButton;
	}


	public WebElement getLeadSourceTextField() {
		return leadSourceTextField;
	}


	public WebElement getTitleTextField() {
		return titleTextField;
	}


	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getMobileTextField() {
		return mobileTextField;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}


	public WebElement getHeaderText() {
		return headerText;
	}


	public WebElement getOrganizationNameLink() {
		return organizationNameLink;
	}
	
	


	
	
	
	
	
	
	
	
	

}
