package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import PageObjects.DesktopPageObject;
import PageObjects.HomePageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ulitities.Utilities;

public class RetailPageStepDefinition extends Base {

	HomePageObject home = new HomePageObject();
	DesktopPageObject desktop = new DesktopPageObject();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		home.clickOnMyAcountButton();
		logger.info("My Acount Button Was clicked successfully");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		home.ClickOnLoginButton();
		logger.info("Login button clicked successfully");
	}

	@When("User enter username ‘userName’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() {
		home.enterEmailForLogin();
		home.enterPasswordForLogin();
		logger.info("email and password entered successfully");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		home.clickOnLoginButtonBlueButton();
		logger.info("login button clicked successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		home.validateMyAcountOptionInMyAcountPage();
		logger.info("user is in My Acount page");
		Utilities.takeScreenShot("MyAcountPage");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		home.clickOnAffliateAccountLink();
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		home.enterCompanyName(data.get(0).get("company"));
		home.enterWebsiteName(data.get(0).get("website"));
		home.enterTaxID(data.get(0).get("taxID"));
		home.selectRadioButtonCheque();
		home.enterChequePayeeName(data.get(0).get("paymentMethod"));

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		home.clickOnAgreeToTermsBox();
		logger.info("checkbox clicked successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button1() {
		home.ClickOnContinueBlueButton();
		logger.info("continue button clicked successfully");
	}

	@Then("User should see a success message for affiliateAcct")
	public void user_should_see_a_success_message_for_affiliate_acct() throws IOException {
		home.valiateRegisterAffliateAcctSuccessMessage();
		logger.info("message for creating affliate account successfully displayed");
		Utilities.takeScreenShot("AffiliateAccount");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
		home.valiateEditAffliateAcctSuccessMessage();
		logger.info("message for edit affliate account successfully displayed");
		Utilities.takeScreenShot("EditAffiliateAccount");
	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		home.clickOnAffiliateAcctLink();
		logger.info("successfully clicked on edit affiliate acct link");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		home.selectRadioButtonBankTransfer();
		logger.info("bank transfer radiobutton selected successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editAffiliate = dataTable.asMaps(String.class, String.class);
		home.enterBankName(editAffiliate.get(0).get("bankName"));
		home.enterAbaNumber(editAffiliate.get(0).get("abaNumber"));
		home.enterSwiftCode(editAffiliate.get(0).get("swiftCode"));
		home.enterBankAcountName(editAffiliate.get(0).get("accountName"));
		home.enterAccountNumber(editAffiliate.get(0).get("accountNumber"));
		logger.info("information for edit accout affiliate entered successfully");

	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		home.ClickOnEditAccountlink();
		logger.info("successfully clicked on edit account information");
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> editAccountInfo = dataTable.asMaps(String.class, String.class);
		home.enterFirstName(editAccountInfo.get(0).get("firstname"));
		home.enterLastName(editAccountInfo.get(0).get("lastName"));
		home.enterEmail(editAccountInfo.get(0).get("email"));
		home.enterTelephone(editAccountInfo.get(0).get("telephone"));
		logger.info("successfully information for edit account entered");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		home.ClickOnContinueBlueButton();
		logger.info("successfully clicked on continue button");
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
		home.valiateEditAccountInforSuccessMessage();
		logger.info("success message for edit acount display successfylly");
		Utilities.takeScreenShot("EditAcountInfo");
	}

	
}
