#This is what Done by BA and provide to the Developers and tester

Feature: Test the skillrary App
1) Valid Case
2) Invalid Case
# we use Background to work with comman thing 
#As in this "given" for all the "senerios" is same thats why we are use background for comman and data is common
Background:
Given i should open the browser and naviagte to the login page of skillrary

@PossitiveTestCase
Scenario: To Test the Login with user Credentials
#What ever we put in "" (doublequotes ) we pass the vale to application
#When Enter Username "user"
#And Enter Password "user"
#Below one is for Multiple Data
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<name>"

Examples:
|user|pass|name|
|user|user|Harry Den|
|user|user|Harry Den|
|admin|admin|SkillRary Admin|


#@PossitiveTestCase
#Scenario: To Test the Login with Admin Credentials
#When Enter Username "admin"
#And Enter Password "admin"
#And Click on the loginbutton
#Then i should see the admin as "SkillRary Admin"

@NegativeTestCase
Scenario: To Test the Login with invalid Credentials
When Enter Username "saksham"
And Enter Password "saksham"
And Click on the loginbutton
Then i should see the Registration page "Register"













#BELOW ONE IS FOR ORANGE HRM AND FIRST CUCUMER PROGRAM
	
#Feature: OrangeHRM
#Scenario: Validate Login
#Given i should be in login pg of OrangeHRM
#When Enter name
#And Enter Passwod
#And Click LoginButton
#Then Login Sucessfully