package cucumberJava;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JpetstoreSteps{
	
	WebDriver driver;
	
	@Given("I have opened a browser")
	public void i_have_opened_a_browser() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("I wrote the {string} on the search bar")
	public void i_wrote_the_on_the_search_bar(String url) throws Throwable {
	    url = "https://petstore.octoperf.com/actions/Catalog.action";
	    driver.get(url);
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() throws Throwable {
	    assertTrue(driver.findElement(By.xpath("//a[.='Sign In']")).isDisplayed());
	}

	@Given("I am on the Jpetstore app")
	public void i_am_on_the_Jpetstore_app() {
	   driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
	}

	@When("I log in with the login {string} and the password {string}")
	public void i_log_in_with_the_login_and_the_password(String login, String password) {
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys(login);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("signon")).click();
	}

	@Then("I log in as a user {string}")
	public void i_log_in_as_a_user(String user) {
	    assertTrue(driver.findElement(By.xpath("//div[@id = \"WelcomeContent\" and contains(., '"+user+"')]")).isDisplayed());
	}

	@Then("a welcome message is displayed")
	public void a_welcome_message_is_displayed() {
		assertTrue(driver.findElement(By.id("WelcomeContent")).isDisplayed());
	}
}