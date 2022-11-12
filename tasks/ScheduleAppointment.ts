import { Locator, Page} from '@playwright/test'
import { Click } from '../actions/Click'
import { SchedulePage } from '../pages/SchedulePage'

export class ScheduleAppointment {
    static page: Page

    static async As(usertype:string) {
        return this
    }

    static async SelectCareService(service:string) {
        await Click.on(SchedulePage.careServiceSelector);
        await Click.on(ScheduleAppointment.selectedService(service));
        return this
    }

    static async SelectDate(date:string) {
        await Click.on(SchedulePage.dateSelector);
    }

    static async SelectLocation(location:string) {
        await Click.on(SchedulePage.locationSelector);
        await Click.on(ScheduleAppointment.selectedLocation(location));
        return this
    }

    static selectedService(service:string): Locator {
        switch (service) {
            case "Illness/Injury":
                return SchedulePage.illnessServiceOption;
                break;
            case "5-Minute Flu Shot":
                return SchedulePage.fiveMinuteFluShotOption;
                break;
            default:
                return SchedulePage.illnessServiceOption;
                break;
        }
    }

    static selectedLocation(location:string): Locator {
        switch (location) {
            case "Portland, OR":
                return SchedulePage.portlandOrOption;
                break;
            case "Seattle, WA":
                return SchedulePage.seattleWaOption;
                break;
            default:
                return SchedulePage.portlandOrOption;
                break;
        }
    }

}
