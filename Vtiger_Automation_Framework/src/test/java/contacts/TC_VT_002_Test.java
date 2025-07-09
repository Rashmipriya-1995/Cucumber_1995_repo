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
public class TC_VT_002_Test extends BaseClass {
	@Test
	public void createContact() {
	
	HomePage hp=new HomePage(driver);
	ContactsPage cp=new ContactsPage(driver);
	
	hp.getContactsLink().click();
	cp.getCreateAccountButton().click();
//	cp.getFirstNameTextField().sendKeys("Rashmi");
	
	cp.getLastNameTextField().sendKeys("Prusty");
	cp.getSaveButton().click();
	
	Assert.assertTrue(cp.getHeaderText().getText().contains("Prusty"), "Contact is not created");
	
	test.log(Status.PASS, "Contact is created");
	
	}
}
