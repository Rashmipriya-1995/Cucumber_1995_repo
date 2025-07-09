package contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass{
	
	@Test
	public void clickOnContacts() {
		HomePage hp=new HomePage(driver);
		hp.getContactsLink().click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("Contacts"), "Contacts page is not displayed");
		
		test.log(Status.PASS, "Contacts page is  displayed");
	}

}
