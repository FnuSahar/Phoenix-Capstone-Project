package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObject extends Base {

	public TabletsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Tablets']")
	private WebElement tabletText;
	@FindBy(xpath = "//a[contains(text(),'Galaxy Tab 10.1')]")
	private WebElement tabsumsungGalaxyTab;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement tabsumsungGalaxyTabAddToCart;
	@FindBy(xpath = "//div[@class='button-group']//button[2]")
	private WebElement tabsumsungGalaxyTabAddToWishList;
	@FindBy(xpath = "//div[@class='button-group']//button[3]")
	private WebElement tabsumsungGalaxyTabCompareThisProduct;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement tabDesktops;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement tablaptopsAndNoteBooks;
	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement tabComponents;
	@FindBy(xpath = "//a[text()='Tablets (1)']")
	private WebElement tabTablets;
	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement tabSoftware;
	@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
	private WebElement tabPhonesAndPDAs;
	@FindBy(xpath = "//a[text()='Cameras (2)']")
	private WebElement tabCamers;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement tabMP3Player;
	@FindBy(xpath = "//a[text()='Product Compare (0)']")
	private WebElement productCompare;
	@FindBy(xpath = "//div[text()='Showing 1 to 1 of 1 (1 Pages)']")
	private WebElement showing1of1;

}
