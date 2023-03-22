package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.base.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends Utility {

	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		browserLaunch();
	}

	@Given("User is on Adactin page")
	public void user_is_on_Adactin_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://adactinhotelapp.com/");

	}

	@When("User enter the {string} and {string}")
	public void user_enter_the_and(String x, String y) {
		driver.findElement(By.id("email")).sendKeys(x);
		driver.findElement(By.id("pass")).sendKeys(y);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {

		driver.findElement(By.xpath("//*[@name='login']")).click();
	}

	@When("User print URL of the page")
	public void user_print_URL_of_the_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@When("User print page title")
	public void user_print_page_title() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(false);
	}

	@When("User enter the username and password")
	public void user_enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("BesantTambaram");
		driver.findElement(By.id("pass")).sendKeys("123456");
	}

	@Then("User verify the error message")
	public void user_verify_the_error_message() {

		Assert.assertTrue(false);
	}

	@Given("User is on google page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}

	@Given("User is on amazon page")
	public void user_is_on_amazon_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");

	}
}
