# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

Welcome to the ZoomCare QA / Automation Candidate Code Challenge. If you are here you most likely have interest in joining the ZoomCare Quality Engineering Team and have been asked to respond to this challenge. If you came here on your own, you are welcome to explore the challenge and use it to sharpen your skills or prepare for future interviews.

The ZoomCare Candidate Code Challenges are intended to take around 2-3 hours to complete. This is not intended to be an extensive test of your programing skills or knowledge, but rather as a starting point for further conversations during the application process.

## Instructions

This Candidate Code Challenge is geared specifically toward QA Engineers with end-to-end testing and programming experience. The challenge is split into two parts: the first is to devise a test plan for the prompt provided, while the second is to create a basic automation framework that executes some of the test cases written. Both parts are of equal importance, but you'll likely spend more time on Part 2 (automation).

Specifically:
1. Create a fork of this repository into your personal GitHub space.
2. Wipe the contents of this README file, and in its place, create two sections: Test Cases and Automation Instructions.
3. Use the Test Cases section in the README file to write all of your test cases in response to the first part.
4. Set up an automation framework and its associated pages/specs/utilities/etc within the repository.
5. Use the Automation Instructions section in the README to provide instructions for how to set up the framework. Assume the user has nothing pre-installed and also does not know how to use the framework you chose.
6. Create a Pull Request back to the original project.

## Prompt

ZoomCare has a unique promise: we make healthcare delightful by giving it to you on your terms. No matter where or when you want care, ZoomCare can provide complete care for all that ails them, in the palm of their hand. The most critical way we deliver on that promise is through our online scheduling system, which is completely self-service by our patients and coordinates the vast majority of appointments we serve. We call this the "Search/Sechedule Moment". Simply visit our public website at https://www.zoomcare.com, and you'll immediately be greeted with a scheduler to get you on your way.

### Part 1

Devise a set of test scenarios / acceptance criteria that covers enough breadth of this feature for a daily smoke test.

A few asks and helpful tips:
- Keep your focus to just the scheduling page (https://www.zoomcare.com/schedule). Anything else is not within scope of this challenge.
- If you click on a time slot, it will redirect you to a login screen if you don't have an account. We aren't concerned with the behavior past this point; focus on the behavior that displays to an unauthenticated guest just browsing our schedule. You can make an account if you wish, but these are real appointments - **please do not actually schedule any appointments for testing**.
- We know there are many, many links on our website. Be selective in which links you want to verify work, and what page they should open up under what condition.
- Prioritize your plan; try to keep your list to 8-10 test cases.
- We're interested in testing the application's front-end user interface, from an end-to-end perspective. Thinking about what the back-end (ie. API endpoint) does is useful, but is not a requirement for this challenge.
- Think about the entire workflow: what happens if you change X parameter? Does Y also change depending on X? What about things changing without any interaction after a period of time?

### Part 2

Take at least three cases that you've written in Part 1, and propose how they would transfer into an automated test by coding/scripting them with a framework and/or tool. Use whatever you're comfortable with (Selenium, Cypress, etc.), and you can write in any programming/scripting language you choose.

What we're looking for:
- Verifying you can write code and/or script well (knowledge of built-in functions for your chosen language, good organization of classes/functions, reasonable use of comments, etc.)
- You have a clear vision for how to automate (using POM or Screenplay methodology, BDD or TDD best practices, etc.)
- You know how to get the results you need (knowledge of the framework(s) and libraries chosen, and using their functionality appropriately)
- Working code is good. Pretty working code is better. Fast, pretty, working code is best.
