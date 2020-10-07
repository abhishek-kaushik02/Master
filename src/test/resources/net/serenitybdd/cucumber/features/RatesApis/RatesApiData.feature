Feature:  Rates Api
 
	The purpose of the feature 
is to make sure
that user is able to fetch all rate data
    
Scenario: Latest forigen exchange rate with symbol USD
    Given Rates api for latest forigen exchange rate
    When The Api is availble for "https://api.ratesapi.io/api/latest?symbols=USD"
    Then Verify that user is able to fetch data from api successfully 
    
Scenario: Latest forigen exchange rate with symbol GBP
    Given Rates api for latest forigen exchange rate
    When The Api is availble for GBP "https://api.ratesapi.io/api/latest?symbols=GBP"
    Then Verify that user is able to fetch data from api successfully     
    
Scenario: Verify that if user passing incorrect Latest forigen exchange rate with symbol apis
    Given Rates api for latest forigen exchange rate
    When The Api is availble for "https://api.ratesapi.io/api/"
    Then Verify that user should not able to fetch data from api successfully   
    
Scenario: Verify that Specific date Foreign Exchange rates
   Given Rates api for Specific date Foreign Exchange rates
   When The api is availble for Specific "https://api.ratesapi.io/api/2010-01-12"
   Then Verify that user is able to fetch data for Specific date Foreign Exchange rates     