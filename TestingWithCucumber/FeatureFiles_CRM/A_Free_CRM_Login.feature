
Feature: Test A_Free_CRM Login Page

Scenario: User should be able to login to A_Free_CRM website with valid data
	Given user opens A_Free_CRM website
	And User enters A_Free_CRM username
	And User enters A_Free_CRM password
	Then user should be able to login to A_Free_CRM application
	And user quits A_Free_CRM website