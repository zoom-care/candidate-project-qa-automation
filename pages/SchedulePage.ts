import { Locator, Page } from '@playwright/test'

export class SchedulePage {

    static page: Page
    static scheduleLink: Locator
    static locationLink: Locator
    static servicesLink: Locator
    static pricingLink: Locator
    static careServiceSelector: Locator
    static illnessServiceOption: Locator
    static fiveMinuteFluShotOption: Locator
    static dateSelector: Locator
    static locationSelector: Locator
    static portlandOrOption: Locator
    static seattleWaOption: Locator

    constructor(page: Page) {
        SchedulePage.page = page
        SchedulePage.scheduleLink = page.locator('[id=nav-schedule]')
        SchedulePage.locationLink = page.locator('[id=nav-locations]')
        SchedulePage.servicesLink = page.locator('[id=nav-services]')
        SchedulePage.pricingLink = page.locator('[id=nav-pricing]')
        SchedulePage.careServiceSelector = page.locator('css=[data-testid="CareSelector.trigger"]')
        SchedulePage.illnessServiceOption = page.locator('css=[data-testid="text-Illness/Injury"]')
        SchedulePage.fiveMinuteFluShotOption = page.locator('css=[data-testid="text-5-Minute Flu Shot"]')
        SchedulePage.dateSelector = page.locator('css=[data-testid="DateSelector.trigger"]')
        SchedulePage.locationSelector = page.locator('css=[data-testid="text-scheduler.location.label"]')
        SchedulePage.portlandOrOption = page.locator('css=[data-testid="text-Portland, OR"]')
        SchedulePage.seattleWaOption = page.locator('css=[data-testid="text-Seattle, WA"]')
    }
}
