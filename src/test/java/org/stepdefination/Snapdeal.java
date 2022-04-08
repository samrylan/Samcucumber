package org.stepdefination;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Snapdeal extends BaseClass {


	@Given("user has to be in the snapdeal page")
	public void user_has_to_be_in_the_snapdeal_page() {
	 	launchurl("https://www.snapdeal.com/");
	}
	@When("user has to search the product{int} and product{int}")
	public void user_has_to_search_the_product_and_product(Integer int1, Integer int2, DataTable d) {
		Map<String, String> m1 = d.asMap(String.class, String.class);
		String u1 = m1.get("product2");
        
		WebElement w = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		filltextbox(w, u1);
		
		//    WebElement w1= driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		//
		//	filltextbox(w1, u2);
	}

	@When("user has to click the search the search button")
	public void user_has_to_click_the_search_the_search_button() {
		WebElement w2 = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		clk(w2);
	} 

	@Then("product will appear")
	public void product_will_appear() {
		System.out.println("**Product***");
		// quit();
	}
}
