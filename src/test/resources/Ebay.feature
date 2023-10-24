Feature: Todays Deals

Background: common methods
Given user launches the browser "https://www.facebook.com"

#Scenario: Percentage deals
#When user clicks on todays deals with one dim map
#|mobile1|iphone|
#|mobile2|nokia|
#|mobile3|sony|
#Then validate the output
#
#Scenario: user deals
#When user clicks on deals
#Then validate the deals output

Scenario Outline: Multiple
When user clicks on create new accout
And user enters the first name "<fname>"
And user enters the last name "<lname>"
And user enters the mobile number "<mnumber>"
And user enters the password "<pass>"
And user chooses the dob
And user select gender
And user clicks on create account




Examples:
|fname|lname|mnumber|pass|
|ud|aya|0123456789|123456789|
|aya|ud|0987654321|978765627|


