Feature: Test A_Free_Guru Login Page

Scenario: User should be able to login to A_Free_Guru website with valid data
	Given user opens A_Free_Guru website
	And User enters A_Free_Guru username
	And User enters A_Free_Guru password
	Then user should be able to login to A_Free_Guru application
	And user quits A_Free_Guru website