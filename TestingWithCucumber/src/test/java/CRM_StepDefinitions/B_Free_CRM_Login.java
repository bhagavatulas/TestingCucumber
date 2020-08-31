package CRM_StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class B_Free_CRM_Login {
	@Given("^user opens B_Free_CRM website$")
	public void user_opens_B_Free_CRM_website() throws Throwable {
		System.out.println("B1_CRM");
	}

	@Given("^User enters B_Free_CRM username$")
	public void user_enters_B_Free_CRM_username() throws Throwable {
		System.out.println("B2_CRM");
	}

	@Given("^User enters B_Free_CRM password$")
	public void user_enters_B_Free_CRM_password() throws Throwable {
		System.out.println("B3_CRM");
	}

	@Then("^user should be able to login to B_Free_CRM application$")
	public void user_should_be_able_to_login_to_B_Free_CRM_application() throws Throwable {
		System.out.println("B4_CRM");
	}

	@Then("^user quits B_Free_CRM website$")
	public void user_quits_B_Free_CRM_website() throws Throwable {
		System.out.println("B5_CRM");
	}
}