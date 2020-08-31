package CRM_StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class A_Free_CRM_Login {
	@Given("^user opens A_Free_CRM website$")
	public void user_opens_A_Free_CRM_website() throws Throwable {
		System.out.println("A1_CRM");
	}

	@Given("^User enters A_Free_CRM username$")
	public void user_enters_A_Free_CRM_username() throws Throwable {
		System.out.println("A2_CRM");
	}

	@Given("^User enters A_Free_CRM password$")
	public void user_enters_A_Free_CRM_password() throws Throwable {
		System.out.println("A3_CRM");
	}

	@Then("^user should be able to login to A_Free_CRM application$")
	public void user_should_be_able_to_login_to_A_Free_CRM_application() throws Throwable {
		System.out.println("A4_CRM");
	}

	@Then("^user quits A_Free_CRM website$")
	public void user_quits_A_Free_CRM_website() throws Throwable {
		System.out.println("A5_CRM");
	}
}