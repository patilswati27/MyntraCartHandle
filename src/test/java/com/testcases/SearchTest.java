package com.testcases;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.SearchPage;

public class SearchTest extends TestBase {
    @Test
	public void searchTest() throws InterruptedException {
	SearchPage page=new SearchPage(driver);	
	page.search("tshirts");
	page.filter();
	page.selectProduct();
	page.addtowish();
	page.removeItem();
		}
}
