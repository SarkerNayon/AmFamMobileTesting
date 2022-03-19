Feature: Bank user probided with new Covid19 Resource

  Scenario Outline: Test Five area zip code to verify the function is working
    Given user on Santander.com home page
    When user click on learn about Covid19 resource
    And user click on Branch locator
    And user click on filter
    And user select location type branch
    And user typed their <zip code>
    Then user should see some location on the map

    Examples:
    |zip code|
    |10007| 
    |11423| 
    |11415| 
    |10005| 
    |10345| 
    