@GuestUser
Feature: Guest User feature

  Background: User opens website
    Given user is on home page

  Scenario: Verify different elements in homepage for guest user
  Then Verify the Login button is displaying in the Home Page Header
    Then Verify the action of Login button
    Then Verify the Register Button is displaying in Home Page header.
    Then Verify the action of Register button
 
    
