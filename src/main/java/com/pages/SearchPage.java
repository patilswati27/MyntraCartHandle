package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SearchPage extends TestBase {
	public SearchPage(WebDriver driver) {
	 TestBase.driver=driver;
	 PageFactory.initElements(driver,this);
	}
	
    @FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement searchText;
    
    @FindBy(xpath="//label[contains(text(),'Women')]")
    WebElement gender;
     
    @FindBy(xpath="//label[contains(text(),'Puma')]")
    WebElement brand;
    
    @FindBy(xpath="//body/div[@id='mountRoot']/div/div[@class='application-base']/main[@class='search-base']/div[contains(@class,'row-base')]/div[@class='search-rightContainer column-base']/div[@id='desktopSearchResults']/div[@class='search-searchProductsContainer row-base']/section/ul[@class='results-base']/li[3]/a[1]/div[1]/div[1]/div[1]")
	WebElement selectProduct;

    @FindBy(xpath="//div[contains(@class,'pdp-add-to-wishlist-full pdp-add-to-wishlist pdp-button pdp-add-to-wishlist pdp-button pdp-add-to-wishlist-disabled pdp-flex pdp-center')]")
    WebElement wishlist;
    
    @FindBy(xpath="//span[contains(text(),'Wishlist')]")
    WebElement wishlistTab;
    
    @FindBy(xpath="//div[@id='item0']//div[@class='itemcard-removeIcon']")
    WebElement removeItem;
    
    
    public void search(String text) throws InterruptedException {
    	searchText.sendKeys(text);
		Thread.sleep(1000);
	}
	public void filter() throws InterruptedException {
		gender.click();
		Thread.sleep(2000);   
		brand.click();
		
	}
	public void selectProduct() {
		selectProduct.click();
		wishlist.click();
	}
	
	public void addtowish() {
		wishlistTab.click();
	}

	public void removeItem() throws InterruptedException {
		removeItem.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
	}
}


