package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationButton;
	
	@FindBy(xpath = "//a[text()='edit']")
	private WebElement editLink;
	
	@FindBy(xpath = "//a[text()='del']")
	private WebElement deleteLink;
	
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement websiteTextField;
	
	@FindBy(xpath = "//input[@name='account_name']")
	private WebElement memberOfTextField;
	
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement selectButton;
	
	@FindBy(xpath = "//input[@id='email1']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@value='Cancel  ']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerText;
	
	
	
	
	public OrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}



	public WebElement getCreateOrganizationButton() {
		return createOrganizationButton;
	}



	public WebElement getEditLink() {
		return editLink;
	}



	public WebElement getDeleteLink() {
		return deleteLink;
	}



	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}



	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}



	public WebElement getMemberOfTextField() {
		return memberOfTextField;
	}



	public WebElement getSelectButton() {
		return selectButton;
	}



	public WebElement getEmailTextField() {
		return emailTextField;
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
	
	
	





}
