@bddtest
Feature: interview test
  APT test feature file

  @apitest
  Scenario: ID_01_02
    Given Rates API for Latest Foreign Exchange rates
    When The API is available for url 'https://api.ratesapi.io/api/latest%20HTTP/2'
    Then I assert the success status of the response
    
    
    @apitest
  	Scenario: ID_03
    Given Rates API for Latest Foreign Exchange rates
    When The API is available for url 'https://api.ratesapi.io/api/'
    Then I assert the response supplied by the call
    
    
     @apitest
  	Scenario: ID_04_05
    Given Rates API for Specific date Foreign Exchange rates
    When The API is available for url 'https://api.ratesapi.io/api/2010-01-12'
    Then I assert the success status of the response
    
    
    @apitest
  	Scenario: ID_06
    Given Rates API for Specific date Foreign Exchange rates
    When The API is available for url 'https://api.ratesapi.io/api/2030-01-12'
    Then I assert the response supplied by the call