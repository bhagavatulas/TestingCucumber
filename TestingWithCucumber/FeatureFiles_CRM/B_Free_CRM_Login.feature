Feature: Test B_Free_CRM Login Page

Scenario: User should be able to login to B_Free_CRM website with valid data
	Given user opens B_Free_CRM website
	And User enters B_Free_CRM username
	And User enters B_Free_CRM password
	Then user should be able to login to B_Free_CRM application
	And user quits B_Free_CRM website