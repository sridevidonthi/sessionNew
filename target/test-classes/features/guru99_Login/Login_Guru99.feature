Feature: Login to Guru99 website and navigate to different projects
  In order to explore different projects in Guru99 
  I want to login to Guru99 website
  
  Background: User is Logged In
	Given I navigate to the login page
	When I submit username 'mgr123' and password 'mgr!23'
	Then I should be logged in 
 
   Scenario: Should see information related to Insurance Project
   Given User is already on the home page
   When User clicks on Insurance Project link
   Then Login page for Insurance gets displayed
   Then complete registration if you are a new user
   And enter the login credentials to login to Insurance website
   