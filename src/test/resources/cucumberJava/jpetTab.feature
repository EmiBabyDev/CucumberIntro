@tab
Feature: JpetTab 

	Background: 
   	Given I have opened a browser

  Scenario Outline: I log in to my account
		Given I am on the Jpetstore app
    When I log in with the login <login> and the password <password>
    Then I log in as a user <user>
    And a welcome message is displayed

    Examples: 
      | login | password | user |
      |"j2ee" |"j2ee"    |"ABC" |
      |"ACID" |"ACID"    |"ABC" |
