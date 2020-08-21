package cucumberJava;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Casino{
	private List<Map<String, String>> persons_list;
	String message;
	
	@Given("the following persons")
	public void the_following_persons(List<Map<String, String>> persons_list) {
		this.persons_list=persons_list;
	}

	@When("they ask if they could go in a casino")
	public void they_ask_if_they_could_go_in_a_casino() {
		for(Map<String, String> map :persons_list) {
			System.out.println(map.get("age"));
			if("false".equals(map.get("gambler"))) {
				System.out.println("Ok not gambler");
				int age_person = Integer.parseInt(map.get("age"));
				if(age_person >= 18) {
					System.out.println("Ok for age");
					message = "of course, come in";
				}
			}
			else {
				message = "no way, get out my face !";
				break;
			}
		}
		System.out.println(message);
	}

	@Then("the bouncer should say {string}")
	public void the_bouncer_should_say(String enter) {
		assertEquals(enter, message);
	}

	
}