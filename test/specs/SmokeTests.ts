import SchedulePage, { Cares, Locations } from  '../../pages/schedule.page';

describe('Smoke Tests', function () {
    beforeEach(async function () {
        await SchedulePage.open();
    });

    it(`use my location`, async function () {
        await SchedulePage.selectLocation(Locations.UseMyLocation)
    });

    it(`flu shot in seattle`, async function () {
        await SchedulePage.selectLocation(Locations.Seattle)
        await SchedulePage.selectCare(Cares.FluShot)
    });

    it(`primary care in portland`, async function () {
        await SchedulePage.selectLocation(Locations.Portland)
        await SchedulePage.selectCare(Cares.PrimaryCare)
    });
});
