### Part 1

Devise a set of test scenarios / acceptance criteria that covers enough breadth of this feature for a daily smoke test.

test cases for dayli smoke test:
	test case 1
	Resume: Try to make an appointment using the option 'my location' from https://www.zoomcare.com/
	Steps:
		1.- go to: https://www.zoomcare.com/
		2.- Click in the option 'my location'
	expected result: The website must take the location of my browser and show the options in my state
	obtained result:

	
	test case 2
	Resume: Try to make an appointment using the option 'Portland, OR' from https://www.zoomcare.com/
	Steps:
		1.-go to: https://www.zoomcare.com/
		2.-using location Portland, OR
		3.-covid 19 rapid antigen test
		4.-click on schedule now
		5.-select a hour 
	expected result: The options for an appointment must be in Portland
	obtained result:
	
	test case 3
	Resume: See the Clinic Services and details about one option
	Steps:
		1.-go to: https://www.zoomcare.com/schedule
		2.-using location Portland, OR
		3.-covid 19 rapid antigen test
		4.-click on schedule now
		5.-Pick a hour
		6.-click View Clinic Services
		7.-see more details
	expected result: We expected to see more detail about the medical asistant that we choose
	obtained result:
	
	test case 4
	Resume: Try to make an appointment in Clinic Care from https://www.zoomcare.com/schedule
	Steps:
		1.-go to: https://www.zoomcare.com/schedule 
		2.-Schedule for Portland and illnes/injury
		3.-click in button search
		4.-click on option Clinic Care
		5.-see the clinics services
		6.-Pick a hour
	expected result: We expected to do an appointment for the medical asistent we choose
	obtained result:
	
	test case 5
	Resume: Try to make an appointment in Video Care from https://www.zoomcare.com/schedule
	Steps:
		1.-go to: https://www.zoomcare.com/schedule 
		2.-Schedule for Portland and illnes/injury
		3.-click in button search
		4.-click on option Video Care
		5.-see the clinics services
		6.-Pick a hour
	expected result: We expected to do an appointment for the medical asistent we choose
	obtained result:
	
	test case 6
	Resume: Try to make an appointment in Clinic Care and then switch to Video Care
	Steps:
		1.-go to: https://www.zoomcare.com/schedule 
		2.-Schedule for Portland and illnes/injury
		3.-click in button search
		4.-click on option Clinic Care
		5.-see the clinics services
		6.-change to Video Care
		7.-Pick a hour
	expected result: We expected to do an appointment in Video Care 
	obtained result:
	
	test case 7
	Resume: Try to make an appointment in 'my location' and then switch to 'Portland, OR'
	Steps:
		1.-go to: https://www.zoomcare.com/schedule 
		2.-Schedule for 'my location' and illnes/injury
		3.-click in button search
		4.-click on option Clinic Care
		5.-see the clinics services
		6.-change the location to 'Portland, OR'
		7.-click in button search
	expected result: We expected to see all the medicals services in Portland
	obtained result:


### Part 2

Take at least three cases that you've written in Part 1, and propose how they would transfer into an automated test by coding/scripting them with a framework and/or tool. Use whatever you're comfortable with (Selenium, Cypress, etc.), and you can write in any programming/scripting language you choose.

What we're looking for:
- Verifying you can write code and/or script well (knowledge of built-in functions for your chosen language, good organization of classes/functions, reasonable use of comments, etc.)
- You have a clear vision for how to automate (using POM or Screenplay methodology, BDD or TDD best practices, etc.)
- You know how to get the results you need (knowledge of the framework(s) and libraries chosen, and using their functionality appropriately)
- Working code is good. Pretty working code is better. Fast, pretty, working code is best.
