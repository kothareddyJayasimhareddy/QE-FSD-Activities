@activity5
Feature: Login Test
Scenario Outline: Testing Login without Example
Given the user on login page
When user enters "<Usernames>" and "<Passwords>"
# And clicks the submit button
Then get confirmation text and verify message as "Invalid credentials"


Examples:
| Usernames | Passwords |
| admin | 1234 |
| admin | 4321 |

