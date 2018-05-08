@Demoqa
Feature: Count no.of textbox,checkbox,Radio button,dropdown

@textbox 
Scenario Outline:
Given The user on Demoqa website
When The user pass data to textboxes "<fname>" "<lname>" "<phno>" "<uname>"  "<mail>" "<pwd>" "<cpwd>" "<des>"
Then The user verify that data "<fname>" "<lname>" "<phno>" "<uname>" "<mail>" "<pwd>"  "<cpwd>" "<des>" in textbox or not
Examples:
  | fname    | lname    | phno       | uname    | mail          |  pwd      | cpwd    | des     |
  | nagamani | nagamani | 9876543298 | nagamani | mani@gmail.com| nagamani  | nagamani | nagamani |


@checkbox
Scenario:
Given The user on Demoqa website
When The user select checkbox
Then The user verify checkbox is select or not

@radiobutton
Scenario:
Given The user on Demoqa website
When The user select radio buttion
Then The user verify radio button select or not


@dropdown
Scenario:
Given The user on Demoqa website
When The user select dropdown
Then The user verify dropdown is select or not

  