Feature: SignUp page

  Scenario:  Successful registration
    When input data and click register button
    Then registration confirmation text is displayed

  Scenario: Request loan
    When click on Request loan link and input data and click apply now button
    Then loan request processed title displayed

  Scenario: Update user profile
    When click on Update profile link and input data and click update
    Then profile updated title is displayed

  Scenario: Logout
    When click on logout button
    Then username input field enabled
