package cucumberJava;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnnotationSteps{
	
	WebDriver driver;



	@Given("I search for floorball France")
	public void i_search_for_floorball_France() throws Throwable {
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("France Floorball"); 
	    driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[3]/center/input[1]")).submit();
	}

	@When("I click on the French floorball federation website")
	public void i_click_on_the_French_floorball_federation_website() throws Throwable {
	    driver.findElement(By.xpath("//div/a[contains(@href,'www.floorball.fr')]/h3")).click();
	}

	@Then("the menu où pratiquer is clickable")
	public void the_menu_is_clickable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(driver.findElement(By.xpath("//div[@id='colgauche']/div[2]/p[7]/a/img")).isEnabled());
	}
}