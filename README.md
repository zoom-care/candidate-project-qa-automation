Section One: Test Scenario and Test Case writing 

Test navigation Links:
1) Navigate to www.zoomcare.com
2)On page load the top navigation bar should have 
	four links up top.
		Schedule
		Location
		services 
		Pricing and insurance

3) Click Schedule
4) User should be navigated to appointment schduling page 
5) click logo to be routed back to home.
6) Next Click the location link  
7) Locations link 
8) User should be routed to locations screen. here a display of each available city should be at the top
9) further down page each city should have a corresponding list of locations 
10) cick logo to be routed back to the homepage 
11) Once on homepage, click Services link in the navigation bar
12) Once navigated to the services user should see a list of services on screen ensure page layout matches design spec.
13) Click logo to return home 
14) Click the Pricing and Insurance link
15) User will be navigated to the Pricing and Insurance  page 
16)Page layout should have Pricing and insurance table and information.


Test Schedule a Visit in the Card on the homepage:
1) from the Homepage click on the select a location dropdown 
2) make a selection on the page 
3) From that selection  move to next dropdown
4) Choose service from dropdown
5) Click Schedule Now to be routed to schduling page.

Ensure that schduleing modal does not let user proceed without selecting correct information:
1) navigate to the the scheduling card 
2)Make no selections in dropdown
3) click the scheduling button 
4) the button should be disabled.
5)User should remain on homepage


Login to ZoomCare:
1) Navigate to www.zoomcare.com
2) From there on page load click the Login button at top right of screen
3) User should be navigated to the to the sign-in page
4)once on sign in page click sign-in button
5)button should be disabled until valid data is logged 
6) enter in email address ('Test@test.com')
7) Enter password ("TestPassword")
8) click "Sign In"
9) for first time users a series of terms and conditions prompts should appear where the User has to accept the terms
10) User should be prompt to click four check boxes with each check with T&A document 
11) once all is accepted  User should be located on the home page.
12) Button in Top right should now say Account and not login

LogOut of Zoomcare page:
1) Navigate to www.zoomcare.com
2) From there on page load click the Login button at top right of screen
3) User should be navigated to the to the sign-in page
4) once on sign in page click sign-in button
5) button should be disabled until valid data is logged 
6) enter in email address ('Test@test.com')
7) Enter password ("TestPassword")
8) click "Sign In"
9) User should see homepage 
10) Find Account link at the top of the page 
11) Click the Account Link
12) User should be navigated to Account settings game
13) Click the logout button 
14) once logged out 
15) Account link should be switched to Login Button


HomePage link test for link Under Jumbotron:
1) On home page find: Same-day Annual Wellness Exams are available!
2) Click link to navigate to the same day Exams that are available 
3) User should be navigated to the  exam Schduling page 
4) page should match design spec and requirements


Reviews section test: 
1) on the - We brag about ourselves section 
2) click the proceed arrows on the reviews section
3)the carousel of reviews shoud move right 
4) click the back arrow and its should move to the left of the screen 


Test Schedule a Visit button:
1) Locate schedule a vist Button under EveryDay Specialty and Care section 
2) Find Button and click button on the screen 
3) User should be navigated to User SHould be navigate to Scheduling Phycisians screen  
4) the time blocks of each phycisian should be visible.





Section Two : Automation Instructions for MS Test

Today we will be going over how to set up an automation project in MSusing C# as the Programming language.
I will be using Visual Studio today. Open visual studio and the first thing that you user sees is the Create new Project modal. 
CLick search bar and type Test or MSTest and framework should pop up. Select MsTest as the Project type and from there you, will choose the version of  C# that you will be working with, The most current is 6.0.
Once Porject has been created, You need to add selenium and other dependencies in order to set up an autmation project. Got to the solution and select manage nuget packages. From there you add "SeleniumWebdriver", "SeleniumSupport",
and then add Chromedriver to the project that you just created.
Once packGES are all installed then from there you are able to begin with automation. You naviagte to the Unit test class that is set up and you can see that there is a class that is scaffolded out with a test methd inside. 
You can add more methods or data in the file to set test up to run properly. 
Ensure that the  Test Method attribute is over any method that you want ran. and you are also able to Use Assertions in order to show if a test passed or not. 
If a test needs to be ran you can start through the test explorer or if you right click in the class you can start it right from the file Using the Run All Tests command, or Start Debuggin 
 





