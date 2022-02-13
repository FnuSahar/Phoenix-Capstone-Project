package PageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

import ulitities.Utilities;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	private WebElement currencyList;
	@FindBy(xpath = "//i[@class='fa fa-caret-down']")
	private WebElement currencyButton;
	@FindBy(xpath = "//ul//li//button[@name='USD']")
	private WebElement usDollar;
	@FindBy(xpath = "//ul//li//button[@name='EUR']")
	private WebElement euro;
	@FindBy(xpath = "//ul//li//button[@name='GBP']")
	private WebElement poundSterling;
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement validateEuro;
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement telephoneIcon;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAcount;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement enterPassword;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement enterEmail;
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBoxRegister;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonRegister;
	@FindBy(partialLinkText = "affiliate account")
	private WebElement affiliateAccountLink;
	@FindBy(xpath = "//div[@class='list-group']//a[1]")
	private WebElement MyAcountPage;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteName;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentmethod;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeToTermBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBlueButton;
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishList;
	@FindBy(linkText = "Shopping Cart")
	private WebElement shoppingCart;
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkOut;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBox;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement SearchButton;
	@FindBy(xpath = "button[@class='btn btn-inverse btn-block btn-lgdropdown-toggle']")
	private WebElement cartButton;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndnotes;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	@FindBy(linkText = "Software")
	private WebElement software;
	@FindBy(linkText = "Cameras")
	private WebElement cameras;
	@FindBy(linkText = "Phones & PDAs")
	private WebElement phoneAndPDAs;
	@FindBy(xpath = "//h3[text()='Featured']")
	private WebElement featuredText;
	@FindBy(xpath = "//img[starts-with(@title,'Mac')]")
	private WebElement macBookImage;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookText;
	@FindBy(xpath = "//span[text()='Ex Tax: $500.00']")
	private WebElement macBookPrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[1]")
	private WebElement macBookAddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[2]")
	private WebElement macBookAddToWishlist;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[3]")
	private WebElement macBookCompareThisProduct;
	@FindBy(xpath = "//*[text()='iPhone']")
	private WebElement iphoneText;
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;
	@FindBy(xpath = "//*[contains(text(),'Ex Tax: $101.00')]")
	private WebElement iphonePrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[1]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[1]")
	private WebElement iphoneAddToWishlist;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[1]")
	private WebElement iphoneCompareThisProdcut;
	@FindBy(xpath = "//a[text()='Apple Cinema 30']")
	private WebElement appleCinema30Text;
	@FindBy(xpath = "//a[normalize-space()='Apple Cinema 30\"']")
	private WebElement appleCinema30Image;
	@FindBy(xpath = "//*[contains(text(),'Ex Tax: $90.00')]")
	private WebElement appleCinema30Price;
	@FindBy(linkText = "MP3 Players")
	private WebElement MP3Players;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[1]")
	private WebElement appleCinema30AddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[2]")
	private WebElement appleCinema30AddToWishList;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[3]")
	private WebElement appleCinema30CompareThisProduct;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS5DText;
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement canonEOS5DImage;
	@FindBy(xpath = "//*[contains(text(),'Ex Tax: $80.00')]")
	private WebElement canonEOS5DPrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div//button[1]")
	private WebElement canonEOS5DAddTOCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div//button[2]")
	private WebElement canonEOS5DAddToWishList;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div//button[3]")
	private WebElement canonEOS5DCompareThisProdcut;
	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement informationText;
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement aboutUs;
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deliveryInformation;
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsAndConditions;
	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement customerServiceText;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUs;
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement returns;
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement siteMap;
	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement extrasText;
	@FindBy(xpath = "//aside//div//a[text()='Order History']")
	private WebElement orderHistory;
	@FindBy(xpath = "//aside//div//a[text()='Newsletter']")
	private WebElement newsLetter;
	@FindBy(xpath = "//p//a[text()='OpenCart']")
	private WebElement openCart;
	@FindBy(xpath = "//div[@id='slideshow0']")
	private WebElement slideShow;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[15]//img")
	private WebElement starbucks;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[14]//img")
	private WebElement disney;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[13]//img")
	private WebElement dell;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[12]//img")
	private WebElement harleyDavidson;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[11]//img")
	private WebElement canon;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[10]//img")
	private WebElement burgerKing;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[9]//img")
	private WebElement cocacola;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[8]//img")
	private WebElement sony;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[7]//img")
	private WebElement redbull;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[6]//img")
	private WebElement NFL;
	@FindBy(xpath = "//div[@id='carousel0']//div//div[5]//img")
	private WebElement nintendo;
	@FindBy(xpath = "//h1[text()='Shopping Cart']//following-sibling::p")
	private WebElement shoppingCartIsEmpty;
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement brands;
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement giftCertificate;
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement affiliates;
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement specials;
	@FindBy(xpath = "//h5[text()='My Account']")
	private WebElement myAcountText;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateAcctLink;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement radioButtonCheque;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement radioButtonBankTransfer;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameTextBox;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumberTextBox;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeTextBox;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameTextBox;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberTextBox;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAcountInfoLink;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameTextBox;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement enterlastNameTextBox;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailTexBox;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneTextBox;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editInfoSuccessMessage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement registerAffliateAcctSuccessMessage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editaffiliateAccont;
	
	public void valiateEditAccountInforSuccessMessage() throws IOException {
		String actualMessage = editInfoSuccessMessage.getText();
		String expectedMessage = "Success: Your account has been successfully updated.";
		Assert.assertEquals(actualMessage, expectedMessage);
		Utilities.highlightelementRedBorderAndTakeScreenshot(editInfoSuccessMessage, "EditAcout");

	}

	public void valiateEditAffliateAcctSuccessMessage() {
		String actualMessage = editaffiliateAccont.getText();
		String expectedMessage = "Success: Your account has been successfully updated.";
		Assert.assertEquals(actualMessage, expectedMessage);
		try {
			Utilities.highlightelementRedBorderAndTakeScreenshot(editaffiliateAccont, "EditAffiliateAcct");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void valiateRegisterAffliateAcctSuccessMessage() {
		String actualMessage = registerAffliateAcctSuccessMessage.getText();
		String expectedMessage = "Success: Your account has been successfully updated.";
		Assert.assertEquals(actualMessage, expectedMessage);
		try {
			Utilities.highlightelementRedBorderAndTakeScreenshot(registerAffliateAcctSuccessMessage,
					"RegisterAffiliateAcct");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void enterFirstName(String firstname) {
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		enterlastNameTextBox.clear();
		enterlastNameTextBox.sendKeys(lastname);
	}

	public void enterEmail(String email) {
		emailTexBox.clear();
		emailTexBox.sendKeys(email);
	}

	public void enterTelephone(String telephone) {
		telephoneTextBox.clear();
		telephoneTextBox.sendKeys(telephone);
	}

	public void ClickOnEditAccountlink() {
		editAcountInfoLink.click();
	}

	public void selectRadioButtonCheque() {
		radioButtonCheque.click();
	}

	public void selectRadioButtonBankTransfer() {
		radioButtonBankTransfer.isSelected();
		radioButtonBankTransfer.click();
	}

	public void enterBankName(String bankName) {
		bankNameTextBox.sendKeys(bankName);
	}

	public void enterAbaNumber(String ABANumber) {
		abaNumberTextBox.sendKeys(ABANumber);
	}

	public void enterBankAcountName(String bankaccountName) {
		accountNameTextBox.sendKeys(bankaccountName);
	}

	public void enterAccountNumber(String bankAccount) {
		accountNumberTextBox.sendKeys(bankAccount);
	}

	public void enterChequePayeeName(String payeeName) {
		chequePayeeName.sendKeys(payeeName);
	}

	public void enterSwiftCode(String swiftCode) {
		swiftCodeTextBox.sendKeys(swiftCode);
	}

	public void validateHomePage() {
		String text = textToValildate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("HomePage is Validated");
		} else {
			logger.info("HomePageValidation Failed");
		}
	}

	public void clickOnCurrencyButton() {
		currencyButton.click();
	}

	public void clickOnCurrencyFromDropDown() {
		List<WebElement> currencyDropDown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 1; i < currencyDropDown.size(); i++) {

			WebElement currencyList = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[" + i + "]"));
			String currencyStr = currencyList.getText();
			if (currencyStr.equalsIgnoreCase("€ Euro")) {
				currencyList.click();
			} else {
				System.out.println("Your currency was not found in the List");
			}

		}
	}

	public void validateChangeOfCurrencyToEuro() throws IOException {
		String actualCurrency = validateEuro.getText();
		String expectedCurrency = "€";
		try {
			Assert.assertEquals(expectedCurrency, actualCurrency);

		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.highlightelementRedBorderAndTakeScreenshot(validateEuro, "EuroSign");
	}

	public void clickOnTelephoneIcon() {
		telephoneIcon.click();
	}

	public void clickOnMyAcountButton() {
		myAcount.click();
	}

	public void ClickOnLoginButton() {
		login.click();
	}

	public void enterEmailForLogin() {
		enterEmail.sendKeys("student1@yahoo.com");// use a new account every time you create an affiliate account
												// otherwise the test will fail
	}

	public void enterPasswordForLogin() {
		enterPassword.sendKeys("student");
	}

	public void clickOnAffliateAccountLink() {
		affiliateAccountLink.click();

	}

	public void validateMyAcountOptionInMyAcountPage() {

		List<WebElement> listOfMyAccountPageOption = driver.findElements(By.xpath("//div[@class='list-group']//a"));
		for (int i = 1; i < listOfMyAccountPageOption.size(); i++) {
			WebElement MyAcountoption = driver.findElement(By.xpath("//div[@class='list-group']//a[" + i + "]"));
			String Myaccount = MyAcountoption.getText();
			if (Myaccount.equalsIgnoreCase("My Account")) {
				MyAcountoption.click();
			} else {
				System.out.println("MyCount information not available");
			}
		}

	}

	public void clickOnLoginButtonBlueButton() {
		loginButton.click();
	}

	public void enterCompanyName(String company) {
		companyName.sendKeys(company);

	}

	public void enterWebsiteName(String website) {
		websiteName.sendKeys(website);

	}

	public void enterTaxID(String taxID) {
		taxId.sendKeys(taxID);

	}

	public void selectPaymentMethod(String paymentMethod) {
		paymentmethod.sendKeys(paymentMethod);

	}

	public void clickOnAgreeToTermsBox() {
		agreeToTermBox.click();

	}

	public void ClickOnContinueBlueButton() {
		continueBlueButton.click();

	}

	public void clickOnWishList() {
		wishList.click();
	}

	public void clickOnShoppingCart() {
		shoppingCart.click();
	}

	public void clickOnCheckout() {
		checkOut.click();
	}

	public void EnterItemsInSearchBox(String item) {
		searchBox.sendKeys(item);

	}

	public void clickOnSearchButton() {
		SearchButton.click();
	}

	public void clickOnCartButton() {
		cartButton.click();
	}

	public void clickOnDesktopButton() {
		desktops.click();

	}

	public void clickOnLaptopsAndnotes() {
		laptopsAndnotes.click();
	}

	public void clickOnComponents() {
		components.click();
	}

	public void clickOnTablets() {
		tablets.click();
	}

	public void clickOnSoftware() {
		software.click();
	}

	public void clickOnPhonesAndPDAs() {

	}

	public void clickOnCameras() {
		cameras.click();
	}

	public void clickOnMP3Player() {
		MP3Players.click();
	}

	public void validateFeaturedText() {
		String text = featuredText.getText();
		if (text.equalsIgnoreCase("Featured")) {
			logger.info("Featured text validated");
		} else {
			logger.info("Featured text not validated");
		}
	}

	public void clickOnMacBooKImage() {
		macBookImage.click();
	}

	public void validateMacBookText() {
		String text = MacBookText.getText();
		if (text.equalsIgnoreCase("MacBook")) {
			logger.info("MacBookText validated");
		} else {
			logger.info("MacBookText not validated");
		}
	}

	public void validateMacBookPrice() {
		String text = macBookPrice.getText();
		if (text.equalsIgnoreCase("Ex Tax: $500.00")) {
			logger.info("MacBookprice validated");
		} else {
			logger.info("MacBookprice not validated");
		}
	}

	public void clickOnMacBookAddToCart() {
		macBookAddToCart.click();
	}

	public void clickOnMacBookAddToWishlist() {
		macBookAddToWishlist.click();
	}

	public void clickOnMacBookCompareThisProduct() {
		macBookCompareThisProduct.click();
	}

	public void validateIphoneText() {
		String text = iphoneText.getText();
		if (text.equalsIgnoreCase("iPhone")) {
			logger.info("iphoneText validated");
		} else {
			logger.info("iphoneText not validated");
		}
	}

	public void clickOnIphoneImage() {
		iphoneImage.click();
	}

	public void validateIphonePrice() {
		String text = iphonePrice.getText();
		if (text.equalsIgnoreCase("Ex Tax: $101.00")) {
			logger.info("iphone price is validated");
		} else {
			logger.info("iphone price is not validated");
		}
	}

	public void clickOnIphoneAddToCart() {
		iphoneAddToCart.click();
	}

	public void clickOnIphoneAddToWishlist() {
		iphoneAddToWishlist.click();
	}

	public void clickOnIphoneCompareThisProduct() {
		iphoneCompareThisProdcut.click();
	}

	public boolean validateAppleCinema30Text() {
		if (appleCinema30Text.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnappleCinema30Image() {
		appleCinema30Image.click();
	}

	public void validateInformationText() {
		String text = informationText.getText();
		if (text.equalsIgnoreCase("Information")) {
			logger.info("Information text in the bottom of the page is validated");
		} else {
			logger.info("Information text in the bottom of the page is not validated");
		}
	}

	public void clickOnAboutUs() {
		aboutUs.click();
	}

	public void clickOnDeliveryInformation() {
		deliveryInformation.click();
	}

	public void clickOnPrivacyPolicy() {
		privacyPolicy.click();
	}

	public void clickOnTermsAndConditions() {
		termsAndConditions.click();
	}

	public void validateCustomerServiceText() {
		String text = customerServiceText.getText();
		if (text.equalsIgnoreCase("Customer Service")) {
			logger.info("Customer Service text in the bottom of the page is validated");
		} else {
			logger.info("Customer Service text in the bottom of the page is not validated");
		}
	}

	public void clickOnContactUs() {
		contactUs.click();
	}

	public void clickOnReturns() {
		returns.click();
	}

	public void clickOnSitemap() {
		siteMap.click();
	}

	public void validateExtrasText() {
		String text = extrasText.getText();
		if (text.equalsIgnoreCase("Extras")) {
			logger.info("Extras text in the bottom of the page is validated");
		} else {
			logger.info("Extras text in the bottom of the page is not validated");
		}
	}

	public void clickOnBrands() {
		brands.click();
	}

	public void clickOnGiftCertificate() {
		giftCertificate.click();
	}

	public void clickOnAffiliates() {
		affiliates.click();
	}

	public void validateMyAccoutText() {
		String text = myAcountText.getText();
		if (text.equalsIgnoreCase("My Account")) {
			logger.info("MyAcount text in the bottom of the page is validated");
		} else {
			logger.info("MyAcount text in the bottom of the page is not validated");
		}
	}

	public void clickOnOrderHistory() {
		orderHistory.click();
	}

	public void clickOnNewsLetter() {
		newsLetter.click();
	}

	public void clickOnOpenCart() {
		openCart.click();
	}

	public void clickOnSlideShow() {
		slideShow.click();
	}

	public void clickOnStarbucks() {
		starbucks.click();
	}

	public void clickOnDisney() {
		disney.click();
	}

	public void clickOnDell() {
		dell.click();
	}

	public void clickOnHarleydavidson() {
		harleyDavidson.click();
	}

	public void clickOnCanon() {
		canon.click();
	}

	public void clickOnBurgerKing() {
		burgerKing.click();
	}

	public void clickOnCocacola() {
		cocacola.click();
	}

	public void clickOnSony() {
		sony.click();
	}

	public void clickOnRedbull() {
		redbull.click();
	}

	public void clickOnNFL() {
		NFL.click();
	}

	public void clickOnNintendo() {
		nintendo.click();
	}

	public void validateShoppingCartIsEmptyMessage() {
		String actualMessage = shoppingCartIsEmpty.getText();
		String expectedMessage = "Your shopping cart is empty!";
		Assert.assertEquals(actualMessage, expectedMessage);
		try {
			Utilities.highlightelementRedBorderAndTakeScreenshot(shoppingCartIsEmpty, "EmptyCart");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void clickOnAffiliateAcctLink() {
		editAffiliateAcctLink.click();
	}

	public void clickOnRegister() {
		register.click();
	}

	public void enterFirstNameforRegister(String firstnameRegister) {
		firstNameField.sendKeys(firstnameRegister);
	}

	public void enterLastNameforRegister(String lastnameRegister) {
		lastNameField.sendKeys(lastnameRegister);
	}

	public void enterEmailforRegister(String emailRegister) {
		emailField.sendKeys(emailRegister);
	}

	public void enterTelephoneNumberforRegister(String phonenumberRegister) {
		telephoneField.sendKeys(phonenumberRegister);
	}

	public void enterPasswordforRegister(String passwordRegister) {
		passwordField.sendKeys(passwordRegister);
	}

	public void enterConfirmPasswordforRegister(String confirmPasswordRegister) {
		confirmPasswordField.sendKeys(confirmPasswordRegister);
	}

	public void confirmTermsCheckBoxforRegister() {
		agreeToTermsCheckBoxRegister.click();
	}

	public void clickOnContinueButtonforRegister() {
		continueButtonRegister.click();
	}

}