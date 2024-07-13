package com.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.generics.AutoConstant;
import com.generics.BaseTest;

import darveysMthod.HomePage;
import darveysMthod.Login;
import darveysMthod.ProductCatalogPage;
import darveysMthod.ProductPage;

public class Darveys extends BaseTest implements AutoConstant{

	@Test(priority=1)
	public void homepage() {
		BaseTest.openBrowser();
		System.out.println("successfully open darveys live application");
	}
	
	@Test(priority=2)
	public void login() throws Exception {
		HomePage.clickLoginSignup();
		Login.enterEmailMobileNumber("badal.sona@gmail.com");
		Login.enterPassword("badal99sona");
		Login.clickLogin();
		System.out.println("logged in as a user_darveys test ");
	}
	
	@Test(priority=3)
	public void placeorder()  throws Exception{
		HomePage.clickCatalogMen();
		driver.navigate().refresh();
		ProductCatalogPage.clickDropDownSortBy();
		ProductCatalogPage.clickDropDownSortByPriceLowestFirst();
		ProductCatalogPage.clickProductonedisplaying();
		ProductPage.clickSelectSizeDropDown();
		//ProductPage.clickSelectSize();



// Locate the size dropdown element
WebElement sizeDropdown = driver.findElement(By.xpath("//body"));

Thread.sleep(2000);
// Click to open the dropdown
sizeDropdown.click();

// Select the option "L"
//Select select = new Select(sizeDropdown);
//select.selectByVisibleText("L");

// Optionally wait for some time after selection (replace with a better wait strategy if possible)
Thread.sleep(2000);







		
	}
	
	
	
	
}
