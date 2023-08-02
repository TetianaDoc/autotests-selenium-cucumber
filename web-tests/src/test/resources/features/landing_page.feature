Feature: Landing page

  Scenario Outline: Open landing page
    When the landing page is open
    Then <elementByName> is visible
    Examples:
      | elementByName           |
      | "ATM Services"    |
      | "Online Services" |
#    And <button> is enabled
#    Examples:
#      |  | button     |  |
#      |  | "Contact"  |  |
#      |  | "About Us" |  |
#      |  | "Log In"   |  |