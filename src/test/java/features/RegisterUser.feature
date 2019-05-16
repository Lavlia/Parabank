Feature: Check the functionality of the Register feature
  As an account holder
  I want to create an online account
  So i can check my bank account from home/office

  #https://parabank.parasoft.com/parabank/index.htm
  Background:
    Given Account holder is on Parabank Website
    When Account holder press on Register link
    Then The account holder should see the Register page

  @TC01
  Scenario: Check the response on register an online bank account with valid data and all the fields filled
    When The account holder is filling all the fields
      | First name | Last name | Address        | City          | State    | Zip Code | Phone    | SSN | Username | Password | Confirm |
      | David      | Sun       | 228 Park Ave S | New York City | New York | NY 10003 | 555-1122 | 333 | Davidi | 123456   | 123456  |
    And Account holder press on REGISTER button
    Then The account holder should see a success message
    When Account holder press the Log Out button
    Then The account holder should see the Home page

  @TC02
  Scenario: Check the response on register an online bank account with invalid data and all the fields are filled
    When The account holder is filling all the fields with invalid data
      | First name | Last name | Address | City | State | Zip Code | Phone | SSN | Username | Password | Confirm |
      | 1          | 1         | 1       | 1    | 1     | 1        | 1     | 1   | 4        | 1        | 1       |
    And Account holder press on REGISTER button
    Then The account holder should see a fail message
    When Account holder press the Parabank Logo
    Then The account holder should see the Home page

  @TC03
  Scenario: Check the response on register an online bank account with valid data and all but one field not filled
    When The account holder is filling all the fields with valid data and all but one field not filled
      | First name | Last name | Address    | City          | State    | Zip Code | Phone    | SSN | Username | Password | Confirm |
      | April      | Spring    | Park Ave S | New York City | New York |          | 555-8888 | 666 | Aprili   | ppppp    | ppppp   |
    And Account holder press on REGISTER button
    Then The account holder should see a required field message
    When Account holder press the Parabank Logo
    Then The account holder should see the Home page

  @TC04
  Scenario: Check the response on register an online bank account with no data
    When The account holder is filling all the fields with no data
      | First name | Last name | Address | City | State | Zip Code | Phone | SSN | Username | Password | Confirm |
      |            |           |         |      |       |          |       |     |          |          |         |
    And Account holder press on REGISTER button
    Then The account holder should see a required fields message
    When Account holder press the home square button
    Then The account holder should see the Home page

  @TC05
  Scenario:
    When The account holder is filling all the fields with valid data
      | First name | Last name | Address  | City          | State    | Zip Code | Phone | SSN | Username | Password | Confirm |
      | May        | Summer    | Park Ave | New York City | New York | 10005    |       | 999 | may2      | may      | may     |
    And Account holder press on REGISTER button
    Then The account holder should see a success message
    When Account holder press the Log Out button
    And Account holder press on Register link
    And The account holder is filling again the fields with the same data
      | First name | Last name | Address  | City          | State    | Zip Code | Phone | SSN | Username | Password | Confirm |
      | May        | Summer    | Park Ave | New York City | New York | 10005    |       | 999 | may2      | may      | may     |
    And Account holder press on REGISTER button
    Then The account holder should see an error message
    When Account holder press the home square button
    Then The account holder should see the Home page