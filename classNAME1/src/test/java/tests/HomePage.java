package tests;


import org.testng.annotations.Test;
import baseClass.BaseClass;



public class HomePage extends BaseClass {




@Test
  public void CheckingMenuLinks() {

	 objects.HomePage OP=new objects.HomePage(driver);
	  timeout();
	  clickOnElement(OP.MenusPicturesAlbum);
	  clickOnFunction(OP.PicturesAlbumLinks.get(0));
    // System.out.println(OP.urls);
	  
  }
}
