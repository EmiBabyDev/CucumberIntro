package cucumberJava;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calcul{
	int num_cal;
	
	@Given("I have entered {int} into the calculator")
	public void i_have_entered_into_the_calculator(int num) {
		System.out.println(num);
		num_cal += num;
	}

	@When("I press add")
	public void i_press_add() {
		System.out.println(num_cal);
	}

	@Then("the result should be {int} on the screen")
	public void the_result_should_be_on_the_screen(int res) {
		assertEquals(res, num_cal);
	}
}