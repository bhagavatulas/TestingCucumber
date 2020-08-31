package Guru_StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class A_Free_Guru_Login {
	@Given("^user opens A_Free_Guru website$")
	public void user_opens_A_Free_Guru_website() throws Throwable {
		System.out.println("A1_Guru");
	}

	@Given("^User enters A_Free_Guru username$")
	public void user_enters_A_Free_Guru_username() throws Throwable {
		System.out.println("A2_Guru");
	}

	@Given("^User enters A_Free_Guru password$")
	public void user_enters_A_Free_Guru_password() throws Throwable {
		System.out.println("A3_Guru");
	}

	@Then("^user should be able to login to A_Free_Guru application$")
	public void user_should_be_able_to_login_to_A_Free_Guru_application() throws Throwable {
		System.out.println("A4_Guru");
	}

	@Then("^user quits A_Free_Guru website$")
	public void user_quits_A_Free_Guru_website() throws Throwable {
		System.out.println("A5_Guru");
	}
}