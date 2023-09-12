Feature: SignUp page
  Scenario:  Successful registration
    When input data and click register button
    Then registration confirmation text is displayed

  Scenario: Request loan
    When click on Request loan link and input data and click apply now button
    Then loan request processed title displayed