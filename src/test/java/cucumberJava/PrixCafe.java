package cucumberJava;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrixCafe{
	private Map<String, Integer> product_list;
	private List<Map<String, String>> products_list;
	int total_cost;
	
	@Given("Le prix des produits de cette liste")
	public void le_prix_des_produits_de_cette_liste(Map<String, Integer> product_list) {
		this.product_list=product_list;
	}
	
	@Given("Le prix des produits de la carte")
	public void le_prix_des_produits_de_la_carte(List<Map<String, String>> products_list) {
		this.products_list=products_list;
	}

	@When("Je commande {int} {string}")
	public void je_commande(Integer product_num, String product) {
	    int price_product = product_list.get(product);
	    total_cost += price_product*product_num;
	}
	
	@When("Je commande au comptoir {int} {string}")
	public void je_commande_au_comptoir(Integer product_num, String product) {
	    for(Map<String, String> map :products_list) {
	    	if(map.get("name").equals(product)) {
	    		int price_product = Integer.parseInt(map.get("price"));
	    		total_cost += price_product*product_num;
	    	}
	    }
	}

	@Then("Je dois payer {int} euros")
	public void je_dois_payer_euros(int bill) {
	    assertEquals(bill, total_cost);
	}
	
}