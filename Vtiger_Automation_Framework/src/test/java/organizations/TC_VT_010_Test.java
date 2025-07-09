package organizations;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_VT_010_Test extends BaseClass{
	@Test
	public void clickOnOrganizations() {
		HomePage hp=new HomePage(driver);
		hp.getOrganizationLink().click();
		
		Assert.assertTrue(driver.getTitle().contains("Organizations"), "Organizations page is not displayed");
		
		test.log(Status.PASS, "Organizations page is  displayed");
	}


}
