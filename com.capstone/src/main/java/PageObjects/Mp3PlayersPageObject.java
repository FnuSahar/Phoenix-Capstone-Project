package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {

	public Mp3PlayersPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Show All MP3 Players']")
	private WebElement showAllMP3Playaer;
	@FindBy(xpath = "//h2[text()='MP3 Players']")
	private WebElement MP3PlayerText;
	@FindBy(xpath = "//img[@title='MP3 Players']")
	private WebElement MP3Image;
	@FindBy(className = "class='col-sm-10")
	private WebElement text;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement refineSearch;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 4 (0)']")
	private WebElement test4;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 6 (0)']")
	private WebElement test6;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 5 (0)']")
	private WebElement test5;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 7 (0)']")
	private WebElement test7;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 8 (0)']")
	private WebElement test8;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 9 (0)']")
	private WebElement test9;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 11 (0)']")
	private WebElement test11;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 12 (0)']")
	private WebElement test12;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 15 (0)']")
	private WebElement test15;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 16 (0)']")
	private WebElement test16;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 17 (0)']")
	private WebElement test17;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 18 (0)']")
	private WebElement test18;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 19 (0)']")
	private WebElement test19;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 20 (0)']")
	private WebElement test20;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 21 (0)']")
	private WebElement test21;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 22 (0)']")
	private WebElement test22;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 23 (0)']")
	private WebElement test23;
	@FindBy(xpath = "//div[@class='row']//a[text()='test 24 (0)']")
	private WebElement test24;
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement ipodClassicText;
	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement ipodClassicImage;
	@FindBy(xpath = "//div//div[@class='product-layout product-list col-xs-12'][1]//span[text()='Ex Tax: $100.00']")
	private WebElement ipodClassicPrice;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//button[1]")
	private WebElement ipodClassicAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//button[2]")
	private WebElement ipodClassicAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//button[3]")
	private WebElement ipodClassicCompareThisProduct;
	@FindBy(xpath = "//a[text()='iPod Nano']")
	private WebElement ipodNanoText;
	@FindBy(xpath = "//img[@title='iPod Nano']")
	private WebElement ipodNanoImage;
	@FindBy(xpath = "//div//div[@class='product-layout product-list col-xs-12'][2]//span[text()='Ex Tax: $100.00']")
	private WebElement ipodNanoPrice;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//button[1]")
	private WebElement ipodNanoAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//button[2]")
	private WebElement ipodNanoAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//button[3]")
	private WebElement ipodShuffleCompareToProdcut;
	@FindBy(xpath = "//a[text()='iPod Shuffle']")
	private WebElement ipodShuffleText;
	@FindBy(xpath = "//img[@title='iPod Shuffle']")
	private WebElement ipodShuffleImage;
	@FindBy(xpath = "//div//div[@class='product-layout product-list col-xs-12'][3]//span[text()='Ex Tax: $100.00']")
	private WebElement ipodShufflePrice;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//button[1]")
	private WebElement ipodShuffleAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//button[2]")
	private WebElement ipodShuffleAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//button[3]")
	private WebElement ipodShuffleCompareToProduct;
	@FindBy(xpath = "//a[text()='iPod Touch']")
	private WebElement ipodTouchText;
	@FindBy(xpath = "//img[@title='iPod Touch']")
	private WebElement ipodTouchImage;
	@FindBy(xpath = "//div//div[@class='product-layout product-list col-xs-12'][4]//span[text()='Ex Tax: $100.00']")
	private WebElement ipodTouchPrice;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//button[1]")
	private WebElement ipodTouchAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//button[2]")
	private WebElement ipodTouchAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//button[3]")
	private WebElement ipodTouchCompareThisProduct;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[13]")
	private WebElement sideNenuTest4;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[14]")
	private WebElement sideNenuTest5;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[15]")
	private WebElement sideNenuTest6;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[16]")
	private WebElement sideNenuTest7;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[17]")
	private WebElement sideNenuTest8;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[18]")
	private WebElement sideNenuTest9;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[1]")
	private WebElement sideNenuTest11;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[2]")
	private WebElement sideNenuTest12;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[3]")

	private WebElement sideNenuTest15;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[4]")
	private WebElement sideNenuTest16;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[5]")

	private WebElement sideNenuTest17;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[6]")
	private WebElement sideNenuTest18;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[7]")
	private WebElement sideNenuTest19;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[8]")
	private WebElement sideNenuTest20;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[9]")
	private WebElement sideNenuTest21;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[10]")
	private WebElement sideNenuTest22;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[11]")
	private WebElement sideNenuTest23;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']/following-sibling::a[12]")
	private WebElement sideNenuTest24;

}
