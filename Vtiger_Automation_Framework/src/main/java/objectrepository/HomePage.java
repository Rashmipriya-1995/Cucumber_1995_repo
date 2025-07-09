package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//img[contains(@src,'Add')]")
	private WebElement addIcon;
	
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsLink;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizationLink;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productsLink;
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documentsLink;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsLink;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement CalendarLink;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement opportunitiesLink;
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement emailLink;
	
	@FindBy(xpath = "(//a[text()='Trouble Tickets'])[1]")
	private WebElement troubleTicketsLink;
	
	@FindBy(xpath = "(//a[text()='Dashboard'])[1]")
	private WebElement dashboardLink;
	
	@FindBy(xpath = "(//a[text()='More'])[1]")
	private WebElement moreLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement myProfileIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getCalendarLink() {
		return CalendarLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getTroubleTicketsLink() {
		return troubleTicketsLink;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getMyProfileIcon() {
		return myProfileIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getAddIcon() {
		return addIcon;
	}
	
	
	
	
	
	
	
	
	
	
	


}
