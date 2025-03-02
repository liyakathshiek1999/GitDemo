Feature: Test the Mercury Application
Scenario: verify mercury login page
Given  User should be on login page
When  user enter username
And  user enter password
And  user click on the login btn
Then verify login page
And close the browser
