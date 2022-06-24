# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

Welcome to the ZoomCare QA / Automation Candidate Code Challenge. If you are here you most likely have interest in joining the ZoomCare Quality Engineering Team and have been asked to respond to this challenge. If you came here on your own, you are welcome to explore the challenge and use it to sharpen your skills or prepare for future interviews.

The ZoomCare Candidate Code Challenges are intended to take around 2-3 hours to complete. This is not intended to be an extensive test of your programing skills or knowledge, but rather as a starting point for further conversations during the application process.

### Test Cases

Test Cases are written in Feature file under resources directory.
everything explained with details inside the project
### Automation Instructions
* Create  XML file that resides in the base directory of the project as pom. xml. The POM contains information about the project and various configuration detail used by Maven to build the project.
* In pom.xml file will create dependencies tag where we store all our dependencies such as Web Driver Manager and Selenium java etc.
* From https://mvnrepository.com/ will get those dependencies.
* Add java faker I might use it in my test cases.
* Since my project is Cucumber with JUnit will add Cucumber JVM java and Cucumber JVM JUnit dependencies.
* Add plug-ins
  1. Cucumber for java
  2. Gherkin 
* At src Directory level we create Configuration.properties and we store browser=chrome so that our driver utility class can read the browser from the directory.
* Create Folder and files
  1. Create resources file
  2. Under resources file we create features directory then we create feature file where we write our test cases in Gherkin language.
* Inside java directory we Create com.zoomcare package then we create Packages
   1. utilities: Inside this package we create ConfigurationReader Class and Driver Class
   2. pages
   3. runners: Create Runner Class then we add tags such like @RunWith(Cucumber.class) and @CucumberOption()
   4. step_definitions
     