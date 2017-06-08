@wip
Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | EmailAddress           | Password |
      | mail2chavala@gmail.com | as543539 |
    Then Message displayed Login Successfully
    Then Message displayed Login Successfully
    And I should see "Welcome to My MandM" page
    When I click on "Continue Shopping"
    Then I should click on MandM logo
    When User LogOut from the Application
    Then Message displayed LogOut Successfully


#  Scenario: Successful LogOut
#    When User LogOut from the Application
#    Then Message displayed LogOut Successfully