import { Locator } from '@playwright/test'

export class Enter {
    static async text(locator:Locator, text:string) {
        await locator.fill(text)
    }
}
