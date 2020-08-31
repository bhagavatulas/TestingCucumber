Feature: Test B_Free_Guru Login Page

Scenario: User should be able to login to B_Free_Guru website with valid data
	Given user opens B_Free_Guru website
	And User enters B_Free_Guru username
	And User enters B_Free_Guru password
	Then user should be able to login to B_Free_Guru application
	And user quits B_Free_Guru website