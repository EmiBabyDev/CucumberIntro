package cucumberJava;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalaryPay{
	List<Employe> list_e = new ArrayList<Employe>();
			int real_salary;
	
	@Given("a list of employees salary")
	public void a_list_of_employees_salary() {
		Employe e1 = new Employe("bob", "35k€");
		Employe e2 = new Employe("bill", "50k€");
		Employe e3 = new Employe("bob", "35k€");
		
		list_e.add(e1);
		list_e.add(e2);
		list_e.add(e3);
	}

	@When("it is a {string}")
	public void it_is_a(String name) {
	    for()
	}

	@Then("the salary should be {string}")
	public void the_salary_should_be(String check_pay) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}