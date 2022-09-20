

# Test Cases


## _Use my location_

### User blocks location
	Scenario
		User blocks the website from share location
	Expected results
		Shows error message
		User able to manually select location

### User allows location, user inside coverage area
	Scenario
		User allows the website to share location
		User is inside the coverage area
	Expected results
		Location properly identifies
		User is presents a list of services

### User allows location, user outside coverage area
	Scenario
		User allows the website to share location
		User is outside the coverage area
	Expected results
		Out of area message shown to user
		User able to manually select location

## _User selects locations_

### User selects a location
	Scenario
		User selects a provided location
	Expected results
		User is presents a list of services
		Services shown are correctly for the specified location

### User changes from one location to another
	Scenario
		User selects a location and then a different provided location
	Expected results
		User is presents a list of services
		Services shown are correctly for the specified location

## _User selects times_

### User selects a time
	Scenario
		User selects a time
	Expected results
		User cannot select a day in the past
		Results table shows appropriate results

## _User selects a service_

### User selects service A

	Scenario
		User selects a location and a service and clicks "Schedule now"
	Expected results
		Selecting a service in a given area gives the proper results for that location and time


## Automation

### To run tests
npm run wdio

