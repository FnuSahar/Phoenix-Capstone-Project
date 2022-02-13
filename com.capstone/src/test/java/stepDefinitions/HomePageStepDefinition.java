package stepDefinitions;

import java.io.IOException;
import PageObjects.HomePageObject;
import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ulitities.Utilities;

public class HomePageStepDefinition extends Base {

	HomePageObject home = new HomePageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		home.validateHomePage();
		logger.info("Homepage validate succesfully");
		Utilities.takeScreenShot("homepage");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.clickOnShoppingCart();
		logger.info("clicked on shopping cart button successfully");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		home.validateShoppingCartIsEmptyMessage();
		logger.info("message Your shopping cart is empty! displayed successfully");

	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		home.clickOnCurrencyButton();
		logger.info("Currency button was clicked successfully");

	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		home.clickOnCurrencyFromDropDown();
		logger.info("Euro currency selected successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
		home.validateChangeOfCurrencyToEuro();
		logger.info("Euro sign displayed successfully");
	}

}
