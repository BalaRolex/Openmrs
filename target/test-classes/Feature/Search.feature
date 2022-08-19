@Search
Feature: Search Customer Record
@SearcCustomerrecord
  Scenario Outline: Enter customer records
    Given Login into application 
    When Select patient search option
    And Enter patient <name> in search box
    Then validate whether patient name is displayed

    Examples: 
      | name  |       
      | John Smith |     
        
