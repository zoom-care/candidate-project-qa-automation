import * as DataProvider from '../data/data-provider'
import { test, expect } from '@playwright/test'
import {SchedulePage} from '../pages/SchedulePage'
import {NavigateMainMenu} from '../tasks/NavigateMainMenu'
import {ScheduleAppointment} from '../tasks/ScheduleAppointment'

test.describe('Schedule feature', () => {
    let schedulePage: SchedulePage

    test.beforeEach(async ({ page }) => {
        schedulePage = new SchedulePage(page)
        await page.goto('https://www.zoomcare.com/schedule')
    })
    
    test('As an unauthenticated user, I should be able to navigate ZoomCares main menu', async ({ page }) => { 
        await NavigateMainMenu.As("Unauthenticated User")
        await NavigateMainMenu.SelectMenu("locations")
        await expect(page).toHaveURL('https://www.zoomcare.com/locations');
        await NavigateMainMenu.GoBackToSchedule()

        await NavigateMainMenu.SelectMenu("services")
        await expect(page).toHaveURL('https://www.zoomcare.com/services');
        await NavigateMainMenu.GoBackToSchedule()

        await NavigateMainMenu.SelectMenu("pricing")
        await expect(page).toHaveURL('https://www.zoomcare.com/services-prices');
        await NavigateMainMenu.GoBackToSchedule()

        await NavigateMainMenu.SelectMenu("schedule")
        await expect(page).toHaveURL('https://www.zoomcare.com/schedule');
        
    })

    test('As an unauthenticated user, I should be able to try to create an appointment with my default location', async ({ page }) => { 
        await (await (await 
            ScheduleAppointment
            .As("Unauthenticated User"))
            .SelectCareService("5-Minute Flu Shot"))
            .SelectDate("time-slot")
    })

    test('As an unauthenticated user, I should be able to try to create an appointment with a listed location', async ({ page }) => { 
        await (await (await (await
            ScheduleAppointment
            .As("Unauthenticated User"))
            .SelectLocation("Seattle, WA"))
            .SelectCareService("5-Minute Flu Shot"))
            .SelectDate("time-slot")
    })
})
