package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base {

	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement comDesktop;
	@FindBy(linkText = "Laptops & Notebooks (5)")
	private WebElement comLaptopsAndNoteBooks;
	@FindBy(linkText = "Components (2)")
	private WebElement comComponents;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[3]")
	private WebElement comMiceAndTrackbakks;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[4]")
	private WebElement comMonitors;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[5]")
	private WebElement comPrinters;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[6]")
	private WebElement comscanners;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[7]")
	private WebElement comWebCameras;
	@FindBy(linkText = "Tablets (1)")
	private WebElement comTablets;
	@FindBy(linkText = "Software (0)")
	private WebElement comSoftware;
	@FindBy(linkText = "Phones & PDAs (3)")
	private WebElement comPhonesAndPDAs;
	@FindBy(linkText = "Cameras (2)")
	private WebElement comCameras;
	@FindBy(linkText = "MP3 Players (4)")
	private WebElement comMp3Players;
	@FindBy(xpath = "//h2[text()='Components']")
	private WebElement componentsText;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement comRefineSearch;
	@FindBy(xpath = "//div[@class='col-sm-9'][1]//div//ul//li//a[text()='Mice and Trackballs (0)']")
	private WebElement underRefineMiceAndTrackBalls;
	@FindBy(xpath = "//div[@class='col-sm-9'][1]//div//ul//li//a[text()='Monitors (2)']")
	private WebElement underRefineMonitors;
	@FindBy(xpath = "//div[@class='col-sm-9'][1]//div//ul//li//a[text()='Printers (0)']")
	private WebElement underRefinePrinters;
	@FindBy(xpath = "//div[@class='col-sm-9'][1]//div//ul//li//a[text()='Scanners (0)']")
	private WebElement underRefineScanners;
	@FindBy(xpath = "//div[@class='col-sm-9'][1]//div//ul//li//a[text()='Web Cameras (0)']")
	private WebElement underRefineWebCameras;
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement ComHPBanner;
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement HomeButton;
	@FindBy(xpath = "//ul[@class='breadcrumb']//li//a[text()='Components']")
	private WebElement ComponentsBesideHomeButton;
}
