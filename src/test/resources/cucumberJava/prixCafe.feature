@cafe
Feature: achat

  Scenario: Vérifier la fonctionalité achat des produits
    Given Le prix des produits de cette liste
    			|café |1|
    			|donut|2|
    When Je commande 2 "café"
    And Je commande 1 "donut"
    Then Je dois payer 4 euros

