Feature: test dictionary page

Scenario: open with valid url
Given the user is on the Wikionary home page
And i enterword in "apple"  search bar
And click on search bar
Then user should able to view the meaning of  word
Then application should be closed

