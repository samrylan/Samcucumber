package org.stepdefination;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends BaseClass{
	static PojoClass p;


	@Given("user has to be in the login page")
	public void user_has_to_be_in_the_login_page() {
		
		launchurl("http://www.adactin.com/HotelApp/");
		
	}
	@When("user has to enter the {string} and enter the {string}")
	public void user_has_to_enter_the_and_enter_the(String username, String pass) {
		PojoClass p = new PojoClass();
		filltextbox(p.getTxtuser(), username);
		filltextbox(p.getPass(), pass);
	}



	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		p = new PojoClass();
		clk(p.getLogin());
	}

	@Then("user cant navigate to the home page")
	public void user_cant_navigate_to_the_home_page() {
		System.out.println("user cant navigate");
	}



}
