package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {

	public SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Software']")
	private WebElement softwareText;
	@FindBy(xpath = "//div[@class='col-sm-9']//p")
	private WebElement thereAreNoProductToTistText;
	@FindBy(linkText = "Continue")
	private WebElement continueButton;
	@FindBy(linkText = "Desktops (13)")
	private WebElement SofDesktops;
	@FindBy(linkText = "Laptops & Notebooks (5)")
	private WebElement sofLaptopsAndNoteBooks;
	@FindBy(linkText = "Components (2)")
	private WebElement sofComponents;
	@FindBy(linkText = "Tablets (1)")
	private WebElement sofTablets;
	@FindBy(linkText = "Software (0)")
	private WebElement sofSoftware;
	@FindBy(linkText = "Phones & PDAs (3)")
	private WebElement sofPhonesAndPDAs;
	@FindBy(linkText = "Cameras (2)")
	private WebElement sofCameras;
	@FindBy(linkText = "MP3 Players (4)")
	private WebElement sofMP3Players;

}
