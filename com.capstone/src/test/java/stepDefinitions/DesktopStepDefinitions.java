package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import PageObjects.DesktopPageObject;
import PageObjects.HomePageObject;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ulitities.Utilities;

public class DesktopStepDefinitions extends Base {

	HomePageObject home = new HomePageObject();
	DesktopPageObject desktop = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		home.clickOnDesktopButton();
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.showAllDesktop();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktop.verifyTagAElementsinDesktopwithTagA();
		desktop.verifyTagElementsinDesktopwithTagButton();
		desktop.verifyTagElementsinDesktopwithTagSpan();
		desktop.verifyTagElementsinDesktopwithTagInput();
		desktop.verifyTagElementsinDesktopwithTagDiv();
		logger.info("All elements with tagA, Button, Span,Input and div displayed successfully");
		Utilities.takeScreenShot("Desktop Page");
	}

	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickOnHPLP3065AddToCart();
		logger.info("HP LP 3065 cart button was successfully clicked");
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer qty) {
		desktop.enterQuantity();
		logger.info("Quantity 1 entered sucessfully");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.ClickOnAddToCartButton();
		logger.info("Cart button was clicked successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) throws InterruptedException, IOException {
		desktop.validateSuccessMessageForAddingHPLP3065();
		logger.info("Success: You have added HP LP3065 to your shopping cart! message is displayed successfully");
	}

	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.clickOnDeskCanonEOS5DAddToCart();
		logger.info("Canon Eos 5D has been successfully added to the cart");
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.SelcolorDropDown();
		logger.info("color red selected successfully");
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart()
			throws IOException, InterruptedException {
		desktop.validateSuccessMessageCanon5D();
		logger.info(
				"success message Success: You have added Canon EOS 5D to your shopping cart! validate successfully");

	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOnCanonEOS5D();
		logger.info("clicked on canon EOS 5D successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnWriteAReview();
		logger.info("clicked on write a review link successfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(data.get(0).get("yourName"));
		desktop.enterYourReview(data.get(0).get("yourReview"));
		desktop.RatingByRadioButton(data.get(0).get("Rating"));
		logger.info("successfully filled the review");

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.clickOnContinueButton();
		logger.info("continue button clicked sucessfully");
	}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval()
			throws IOException {
		desktop.validateSccessMessageFroWritingReview();
		logger.info("thank you for your revew message validated");

	}

}
