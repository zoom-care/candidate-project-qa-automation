# ZoomCare Candidate Code Challenge - QA / Automation

![ZoomCare Logo](https://avatars0.githubusercontent.com/u/48925141?s=150)

## Part 1 - Test Cases
| ID Test | Title | Requirement | Steps |
|--|--|--|--|
| ZC01 | Verify elements in scheduled page | User not logged in | 1. Go to Schedule page<br  /> 2. Verify if is displayed City Selector<br  />3. Verify if is displayed Service Selector <br  />4. Verify if is displayed Date picker<br  />5. Verify if is displayed Search Button|
| ZC02 | Schedule Clinic Care | User not logged in | 1. Go to Schedule page<br/>2. Select a City in first selector<br  />3. Select a Service in second selector<br  />3. Select a day in the third selector<br  />4. Press Search Button<br  />5. Select a time in the result<br  />6. Verify the user need to log in |
| ZC03 | Schedule Video Care | User not logged in | 1. Go to Schedule page<br/>2. Select a City in first selector<br  />3. Select a Service in second selector<br  />3. Select a day in the third selector<br  />4. Press Search Button<br  />5. Click on the Video Care button <br  />6. Select a time in the result<br  />7. Verify the user need to log in |
| ZC04 | Verify Cities list from API | User not logged in | 1. Go to Schedule page<br  />2. Call the cities.json service<br  />3. Verify all is correctly displayed |
| ZC05| Verify Services from API | User not logged in | 1. Go to Schedule page<br  />2. Call the service-line-nav service.json service<br  />3. Verify all is correctly displayed |
| ZC06 | ChatCare Service | User not logged in | 1. Go to Schedule page<br/>2. Select Portland, OR in City selector<br  />3. Select a Illness/Injury Service in second selector<br  />3. Select a day in the third selector<br  />4. Press Search Button<br  />5. Click on the ChatCare button <br  />6. Verify the user need to log in |
| ZC07 | Use my Location option in City Selector | User not logged in | 1. Go to Schedule page<br  />2. Select USE MY LOCATION option in the City selector<br  />3. Grant the permission for location<br  />4. Select a day in the third selector<br  />5. Press Search Button<br  />6. Select a time in the result<br  />7. Verify the user need to log in |
| ZC08 | Use my Location option in City Selector where there is not services available in that area | User not logged in | 1. Go to Schedule page<br  />2. Select USE MY LOCATION option in the City selector<br  />3. Grant the permission for location<br  />4. Verify *We're not in your area yet—but we're growing almost as fast as we deliver care! Out of area* message is displayed in the selector|

## Part 2 - Automation
### Requirements
- Maven 3.8
- Java 1.8
- Google Chrome Browser

### How to run
Run in terminal the following command
    mvn clean test