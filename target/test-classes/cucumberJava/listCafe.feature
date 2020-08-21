@map
Feature: achat
  Scenario: Vérifier la fonctionalité achat des produits
    Given Le prix des produits de la carte
    			|name |price|
    			|café |1    |
    			|donut|2    |
    When Je commande au comptoir 2 "café"
    And Je commande au comptoir 1 "donut"
    Then Je dois payer 4 euros
