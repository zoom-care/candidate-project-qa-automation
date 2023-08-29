const SchedulePage = require('../pageobjects/schedule.page');
const Page = require('../helpers');
const chai = require('chai'); // Import the chai library
const expect = chai.expect; // Use the expect style from chai


describe('ZoomCare Schedule Page', () => {
    beforeEach(async() => {
        Page.open();
        const currentUrl = await browser.getUrl();
        expect(currentUrl).to.contain("schedule");
    });
    let primaryCare = 'Primary Care'
    let dermatology = 'Dermatology'
    let mentalHealthMedsInitial = 'Mental Health Meds - Initial'
    let today = 'Today'
    let tomorrow = 'Tomorrow'

    it('[TC-01] Verify that the patient can search for a specific service', async() => {
        await SchedulePage.selectLocation('Seattle, WA');
        await SchedulePage.selectService(primaryCare);
        await SchedulePage.selectDate(today);
        await SchedulePage.clickSearch();

        // Check if the Service Line Title is correct
        const isPrimaryCareHeaderDisplayed = await SchedulePage.isServiceLineTitleDisplayed(primaryCare);
        expect(isPrimaryCareHeaderDisplayed).to.be.true;
    });

    it('[TC-02] Verify that the patient can schedule the Clinic Care appoinment', async() => {
        await SchedulePage.selectLocation('Salem, OR');
        await SchedulePage.selectService(dermatology);
        await SchedulePage.selectDate(tomorrow);
        await SchedulePage.clickSearch();
        await SchedulePage.clickClinicCare();
        await SchedulePage.clickFirstAvailableSlot();

        // Check if the Patient redirected to the Login Page
        const currentUrl = await browser.getUrl();
        expect(currentUrl).to.contain("login");

    });

    it('[TC-03] Verify that the patient can schedule the VideoCare appoinment', async() => {
        await SchedulePage.selectLocation('Salem, OR');
        await SchedulePage.selectService(dermatology);
        await SchedulePage.selectDate(tomorrow);
        await SchedulePage.clickSearch();
        await SchedulePage.clickVideoCare();

        // Check if the Service Line Title is correct
        const isDermatologyHeaderDisplayed = await SchedulePage.isServiceLineTitleDisplayed(dermatology);
        expect(isDermatologyHeaderDisplayed).to.be.true;

        await SchedulePage.clickFirstAvailableSlot();

        // Check if the Patient redirected to the Login Page
        const currentUrl = await browser.getUrl();
        expect(currentUrl).to.contain("login");

    });

    it('[TC-04] Verify that the patient can schedule the appoinment for the next available date', async() => {
        await SchedulePage.selectLocation('Vancouver, WA');
        await SchedulePage.selectService(mentalHealthMedsInitial);
        await SchedulePage.selectDate(today);
        await SchedulePage.clickSearch();
        await SchedulePage.clickNextAvailableDateButton();

        // Check if the Service Line Title is correct
        const isMentalHealthMedsInitialHeaderDisplayed = await SchedulePage.isServiceLineTitleDisplayed(mentalHealthMedsInitial);
        expect(isMentalHealthMedsInitialHeaderDisplayed).to.be.true;

        await SchedulePage.clickFirstAvailableSlot();

        // Check if the Patient redirected to the Login Page
        const currentUrl = await browser.getUrl();
        expect(currentUrl).to.contain("login");
    });
});