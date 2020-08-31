package Guru_StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class B_Free_Guru_Login {
	@Given("^user opens B_Free_Guru website$")
	public void user_opens_B_Free_Guru_website() throws Throwable {
		System.out.println("B1_Guru");
	}

	@Given("^User enters B_Free_Guru username$")
	public void user_enters_B_Free_Guru_username() throws Throwable {
		System.out.println("B2_Guru");
	}

	@Given("^User enters B_Free_Guru password$")
	public void user_enters_B_Free_Guru_password() throws Throwable {
		System.out.println("B3_Guru");
	}

	@Then("^user should be able to login to B_Free_Guru application$")
	public void user_should_be_able_to_login_to_B_Free_Guru_application() throws Throwable {
		System.out.println("B4_Guru");
	}

	@Then("^user quits B_Free_Guru website$")
	public void user_quits_B_Free_Guru_website() throws Throwable {
		System.out.println("B5_Guru");
	}
}