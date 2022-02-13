package stepDefinitions;

import java.util.List;
import java.util.Map;
import PageObjects.HomePageObject;
import core.Base;
import io.cucumber.java.en.Then;

public class RegisterStepDefinition extends Base {

	HomePageObject home = new HomePageObject();

	@Then("user fill registeration form with information below")
	public void user_fill_registeration_form_with_information_below(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> register = dataTable.asMaps(String.class, String.class);
		home.enterFirstNameforRegister(register.get(0).get("firstname"));
		home.enterLastNameforRegister(register.get(0).get("lastname"));
		home.enterEmailforRegister(register.get(0).get("email"));
		home.enterTelephoneNumberforRegister(register.get(0).get("telephone"));
		home.enterPasswordforRegister(register.get(0).get("password"));
		home.enterConfirmPasswordforRegister(register.get(0).get("confirmPassword"));
		logger.info("information for register entered successfully");

	}

	@Then("user click on agree to terms checkbox")
	public void user_click_on_agree_to_terms_checkbox() {
		home.confirmTermsCheckBoxforRegister();
		logger.info("checkbox button successfully clicked for register");
	}

	@Then("user click on continue button for register")
	public void user_click_on_continue_button_for_register() {
		home.clickOnContinueButtonforRegister();
		logger.info("continue button was clicked successfully for register");
	}

	@Then("user click on register button")
	public void user_click_on_register_button() {
		home.clickOnRegister();
		logger.info("register button clicked successfully");
	}
}
