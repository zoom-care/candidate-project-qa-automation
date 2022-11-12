import { Click } from '../actions/Click'
import { SchedulePage } from '../pages/SchedulePage'

export class NavigateMainMenu {

    static async As(usertype:string) {
        
    }

    static async SelectMenu(menu:string) {
        switch (menu) {
            case "schedule":
                await Click.on(SchedulePage.scheduleLink);
                break;
            case "locations":
                await Click.on(SchedulePage.locationLink);
                break;
            case "services":
                await Click.on(SchedulePage.servicesLink);
                break;
            case "pricing":
                await Click.on(SchedulePage.pricingLink);
                break;
            default:
                await Click.on(SchedulePage.scheduleLink);
                break;
        }
    }

    static async GoBackToSchedule() {
        await SchedulePage.page.goto('https://www.zoomcare.com/schedule');
    }
    
}
