
Feature: To login to adactin Homepage
@Reg
  Scenario Outline: To validate user is in login page
    Given User is in adactin Login Page /Homepage
    When  User has to enter the vaild "<userName>" and "<password>"
    And   User has to fill the mandatory fields "<Location>" and "<Hotels>" and "<Room Type>" and "<Number of Rooms>" and "<Adults per Room>"and"<Children per Room>"
    And 	User has to click the select button
    And 	User has to fill the mandatory fields "<FirstName>" and "<LastName>" and "<Billing Address>" and "<Credit Card No>" and "<Credit Card Type>" and "<Expiry Month>"and "<Expiry Year>"and "<CVV Number>"
    Then  User should navigate to Booking Confirm Page

    Examples: 
  | userName 	|password	|Location	|Hotels			|Room Type	|Number of Rooms|Adults per Room|Children per Room|FirstName|LastName|Billing Address|Credit Card No	|Credit Card Type|Expiry Month|Expiry Year|CVV Number|
  |PrakashJosh|I04PE3		|Paris		|Hotel Creek|Double			|1 - One				|2 - Two				|1 - One					|Prakash	|Josh		 |Avadi					 |5265789656522121|VISA						 |August      |2020				|356|
 
  