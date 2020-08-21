@jpet
Feature: Jpetstore app

Background: 
   Given I have opened a browser

  @scenar1
  Scenario: Access the Jpetstore applilcation
    When I wrote the "url" on the search bar
    Then the home page is displayed

  @scenar2
  Scenario: I log in to my account
    Given I am on the Jpetstore app
    When I log in with the login "j2ee" and the password "j2ee"
    Then I log in as a user "ABC"
    And a welcome message is displayed

  