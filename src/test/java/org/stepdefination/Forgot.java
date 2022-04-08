package org.stepdefination;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Forgot extends BaseClass {


@When("user has to click the forget password link")
public void user_has_to_click_the_forget_password_link() {
       WebElement f1 = driver.findElement(By.xpath("//div[@class='login_forgot']"));
       clk(f1);
}

@When("user has to search the account by using emailid")
public void user_has_to_search_the_account_by_using_emailid() {
      WebElement f2 = driver.findElement(By.xpath("//input[@class='reg_input']"));
      filltextbox(f2, "sam");
      
      WebElement f3 = driver.findElement(By.id("Submit"));
      clk(f3);
}
}