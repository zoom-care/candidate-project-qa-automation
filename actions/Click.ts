import { Locator } from '@playwright/test'

export class Click {
    static async on(locator:Locator) {
        await locator.click()
    }
}
