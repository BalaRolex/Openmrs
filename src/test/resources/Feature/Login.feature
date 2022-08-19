@login
Feature: Login
@First
    Scenario Outline: Login into Openmrs
    Given Launch browser
    When user enters <Username> and <Password> in login field
    When user select location and click login
    Then validate whether home page displayed
    
      Examples: 
      | Username |     | Password |        
      | admin    |     | Admin1234 |       
      | admin    |     | Admin123 |  
       
       


