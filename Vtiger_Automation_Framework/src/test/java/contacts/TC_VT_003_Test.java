package contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.ContactsPage;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass {
	
	@Test
	public void createContactWithOrganization() {
		HomePage hp=new HomePage(driver);
		hp.getContactsLink().click();
		
		ContactsPage cp=new ContactsPage(driver);
		cp.getCreateAccountButton().click();
		cp.getLastNameTextField().sendKeys("Ruby");
		
		cp.getOrganizationNameTextField();
		cp.getSelectButton().click();
		wUtil.switchToWindow(driver, "Accounts");
		cp.getOrganizationNameLink().click();
		
		wUtil.switchToWindow(driver, "Contacts");
		cp.getSaveButton().click();
		
		Assert.assertTrue(cp.getHeaderText().getText().contains("Ruby"), "Contact is not created with Organization name");
		test.log(Status.PASS, "Contact is created with Organization name");
	}

}
