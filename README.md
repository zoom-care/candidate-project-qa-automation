Test Cases:
1. Navigate to site
2. Scheduler displays: Schedule your visit title
			Choose Location dropdown
			Choose Service dropdown 
			Schedule Now button
3. Enter data, click Schedule Now - Seattle, Illness/Injury
4. Schedule page displays: Want care (in Seattle)
			   Service dropdown (Illness/Injury is selected)
			   Calendar dropdown
			   Clinic Care button
			   VideoCare button
			   ChatCare button
			   Service title
			   Info link
			   ServiceLine 
5. ServiceLine displays: ServiceLine location
			 ServiceLine provider
6. ServiceLine location displays: Address
			 	  Map button
   			 	  View clinic services
7. ServiceLine provider displays: Provider name
				  team
 			 	  Date info
				  Time slot
8. Click time slot
9. Login page dislays: Sign Up
		       Log In
           
Automation Instructions
Install testng.jar in your classpath.
Run test from command line as follows:
C:\projectfred> java -cp "path-tojar/testng.jar:path_to_yourtest_classes" org.testng.TestNG testng.xml
Or set up a job in Jenkins that can be used to run the tests ad hoc or on a schedule.


