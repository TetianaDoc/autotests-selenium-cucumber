Feature: Landing page

  Scenario Outline: The web elements are visible on the page
    When the landing page is open
    Then <elementByName> is visible
    Examples:
      | elementByName                      |
      | "Solutions"                        |
      | "About Us"                         |
      | "Services"                         |
      | "Products"                         |
      | "Locations"                        |
      | "Admin Page"                       |
      | "Experience the difference"        |
      | "Customer Login"                   |
      | "Username"                         |
      | "Password"                         |
      | "Forgot login info?"               |
      | "Register"                         |
      | "home"                             |
      | "about"                            |
      | "contact"                          |
      | "Withdraw Funds"                   |
      | "Transfer Funds"                   |
      | "Check Balances"                   |
      | "Make Deposits"                    |
      | "ATM Services"                     |
      | "Bill Pay"                         |
      | "Account History"                  |
      | "Transfer Funds"                   |
      | "Read More"                        |
      | "Latest News"                      |
      | "Home"                             |
      | "Forum"                            |
      | "Site Map"                         |
      | "Contact Us"                       |
      | "© Parasoft. All rights reserved." |
      | "www.parasoft.com"                 |
      | "Online Services"                  |

  Scenario Outline: The inputs are enabled on the page
    When the landing page is open
    Then <elementByInputType> is enabled
    Examples:
      | elementByInputType |
      | "password"         |
      | "submit"           |
      | "text"             |
