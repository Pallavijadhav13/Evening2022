Feature: Login Functionality


Background: Sucessfully cancle Initially Login page
When user open "Chrome" browser with exe as 
When user enter url as
When user cancle intitial login window

@SmokeTest
Scenario:Login functionality with valid creadentials
When user navigate on login button
When user click on My Profile
When user enter "9730579880" as username
When user enter "Pallavi@1234" as password
When user click on Login button
Then Application shows user profile to user



