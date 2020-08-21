@casino
Feature: Casino entrance control

  Scenario: A groupe of persons who are allowed to enter the casino ask the bouncer
    Given the following persons
    	|age|gambler|
    	|18 |false  |
    	|26 |false  |
    	|120|false  |
    When they ask if they could go in a casino
    Then the bouncer should say "of course, come in"
    
    Scenario: A groupe of persons who are allowed to enter the casino ask the bouncer
    Given the following persons
    	|age|gambler|
    	|18 |true  |
    	|26 |false  |
    	|120|false  |
    When they ask if they could go in a casino
    Then the bouncer should say "no way, get out my face !"