package organizations;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.ContactsPage;
import objectrepository.HomePage;
import objectrepository.OrganizationsPage;
@Listeners(ListenerUtility.class)
public class TC_VT_011_Test extends BaseClass {
	@Test
	public void createOrganization() {
	
	HomePage hp=new HomePage(driver);
	OrganizationsPage op=new OrganizationsPage(driver);
	
	hp.getOrganizationLink().click();
	op.getCreateOrganizationButton().click();
	
	op.getOrganizationNameTextField().sendKeys("Amazon"+jutil.getRandomNumber());
	op.getSaveButton().click();
	
	Assert.assertTrue(op.getHeaderText().getText().contains("Amazon"), "Organization is not created");
	
	test.log(Status.PASS, "Organization is created");
	
	}
}

