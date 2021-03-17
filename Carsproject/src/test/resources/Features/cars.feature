@Search-cars @tag
Feature: valided search cars working
  I want to use this template for my feature file
  inorder to validate
  the search carspage is working fine
  qe will do the accepttence testing

  @Search-cars-positive
  Scenario: validate search cars posative
    Given i am the home page "https://www.carsguide.com.au/" of cars guide webside
    When i move to car manu
      | Manu         |
      | Car for sale |
      | Seal my car  |
    And Click on "Search Cars" link
    And Select carbrand as "BMW" from anymake dropdown
    And Select carbrand as "1.SERIES" from aselectmodel dropdown
    And select locator as "Australia" from selectlocation dropdown
    And select price as "$1,000" from price dropdown
    And click onFind_MY_Next_Car_button
    Then I should be list of searched cars
    And the page title should be "Bmw 1 Series Cars Under 1000 for sale |Carsguide"
   