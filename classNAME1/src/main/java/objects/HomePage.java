/**
 * 
 */
package objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;



/**
 * @author yakov
 *
 */
public class HomePage extends BaseClass  {

	
	WebDriver Ldriver;
	public HomePage(WebDriver Rdriver){
		Ldriver=Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
	
	
public String[]urls;
	
//main menu
@FindBy(xpath = "//div//button[@data-tab-title-id='801']")
public WebElement MenusPicturesAlbum;

@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[1]//li//a")
public List<WebElement> PicturesAlbumLinks;

@FindBy(xpath = "//div//button[@data-tab-title-id='10120']")
public  WebElement MenusWallOfPictures;

@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[2]//li")
public List<WebElement> WallOfPicturesLinks;
@FindBy(xpath = "//div//button[@data-tab-title-id='1370']")
public WebElement MenusCalendars;
@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[3]//li")
public List<WebElement> CalendarsLinks;
@FindBy(xpath = "//div//button[@data-tab-title-id='9916']")
public WebElement MenuAdditionalProducts;
@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[4]//li")
public List<WebElement> AdditionalProductsLinks;
@FindBy(xpath = "//div//button[@data-tab-title-id='810']")
public WebElement MenuHowToDoLupa;
@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[5]//li")
public List<WebElement> HowToDoLupaLinks;
@FindBy(xpath = "//div//button[@data-tab-title-id='810']")
public WebElement MenuProductsPricesAndShipment;
@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[6]//li")
public List<WebElement> ProductsPricesAndShipmentLinks;
@FindBy(xpath = "//div//button[@data-tab-title-id='9952']")
public WebElement MenuAboutUs;
@FindBy(xpath = "//menu//nav[@class='tabs-content tabs-content--visible']//ul[7]//li")
public List<WebElement> AboutUsLinks;


public void getURl() {

}

   
  

}
