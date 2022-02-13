package stepDefinitions;

import java.io.IOException;

import PageObjects.HomePageObject;
import PageObjects.LaptopsNoteBooksPageObject;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopAndNotebookStepDefinition extends Base {

	LaptopsNoteBooksPageObject laptopNotebook = new LaptopsNoteBooksPageObject();
	HomePageObject home = new HomePageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		home.clickOnLaptopsAndnotes();
		logger.info("successfully clicked on laptop&notebook on home page");

	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNotebook.showAllLaptopAndNoteBooks();
		logger.info("successfully clicked on show all Laptops and notebooks");

	}

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopNotebook.clickOnMacBookItem();
		logger.info("successfully clicked on macbook item");

	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptopNotebook.verifyCartTotal(string);
		logger.info("1 item(s) - $602.00 successfully displayed");
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNotebook.clickOnCartOption();
		logger.info("click on cart black button successfully");

	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNotebook.clickOnRemoveItemButton();
		logger.info("successfully clicked on x button for removing item");
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws IOException {
		laptopNotebook.verifyCartTotalAfterRemovingItem(string);
		logger.info("0 item(s) - $0.00 displayed successfully");
	}

	@Then("User should see a message that'Success: You have added MacBook to your shopping cart!'")
	public void user_should_see_a_message_that_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopNotebook.verifySuccessMessage();
		logger.info("Success: You have added MacBook to your shopping cart! displayed successfully");

	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNotebook.clickOnMacbookComparisonIcon();
		logger.info("successfully clicked on macbook compare icon");

	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNotebook.clickOnMacbookAirCompareProduct();
		logger.info("successfully clicked on macbook air compare icon");

	}

	@Then("User should see a success message that says {string}")
	public void user_should_see_a_success_message_that_says(String string) throws IOException {
		laptopNotebook.ValidateSuccessMessageMacbookAirComparison(string);
		logger.info("Success: You have added MacBook Air to your product comparison! isplayed successfully");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNotebook.clickOnComparisonLink();
		logger.info("successfully clicked on comparison link");
		

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopNotebook.valiateComparisonTable();
		logger.info("comparison chart displayed successfully");

	}
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopNotebook.clickOnAddToWishListSonyVaio();
		logger.info("successfully clicked on SonyVaio wishlist");

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		     

	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) throws IOException {
		laptopNotebook.validateyouMustLoginToAddSonyVaioToWishListMessage(string);
		logger.info(" You must login or create an account to save Sony VAIO to your wish list! displayed successfully");
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopNotebook.clickOnMacbookProText();
		logger.info("clicked successfully on MacBook Pro");
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) throws IOException {
		laptopNotebook.macbookPrice2000presentInUI();
		logger.info("macbook pro price of 2000 displayed successfully");
	   
	}
}