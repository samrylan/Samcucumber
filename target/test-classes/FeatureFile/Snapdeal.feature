@login
Feature: To check the search functionality
#1D   
Scenario: To search the product 
Given user has to be in the snapdeal page
When user has to search the product1 and product2 
    |product1|powerbank|
    |product2|earphone|
When user has to click the search the search button
Then product will appear

