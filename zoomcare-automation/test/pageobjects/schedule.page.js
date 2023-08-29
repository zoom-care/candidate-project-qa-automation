const expect = require('chai');

class SchedulePage {

    get chooseLocationDropdown() {
        return $('[data-testid="quickSelector.locationSelector"]');
    }
    locationName(location) {
        return $(`[data-testid="text-quick-selector-option-location-${location}"]`);
    }
    get chooseServiceDropdown() {
        return $('[data-testid="quickSelector.serviceSelector"]');
    }
    serviceName(service) {
        return $(`[data-testid="text-quick-selector-option-service-${service}"]`)
    }
    get chooseDateDropdown() {
        return $('[data-testid="quickSelector.dateSelector"]');
    }
    get selectedDate() {
        return $('[data-testid="quickSelector.date.popover"]');
    }
    get dateElement() {
        return $('[data-testid = "quickSelector.date.popoverContent"].css - 1 awozwy');
    }
    get searchButton() {
        return $('[data-testid="button-quickSelector.searchButton"]');
    }
    get refreshButton() {
        return $('[data-testid="button-quickSelector.searchButton"]');
    }
    serviceLineTitle(service) {
        return $(`[data-testid="text-scheduler.serviceLine.title-${service}"]`); // Currently the locator returns undefined. Assuming that it will return the service name
    }
    get serviceLineResultFirstClinic() {
        return $('[data-testid="ServiceLine.1.Clinic.1"]');
    }
    get firstAvailableSlot() {
        return $('[data-testid="button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1"]');
    }
    get clinicCareButton() {
        return $('[data-testid="virtualClinicBox"]');
    }
    get videoCareButton() {
        return $('[data-testid="virtualVideoBox"]');
    }
    get mapButton() {
        return $('[data-testid="map-button"]');
    }
    get nextAvailableDateButton() {
        return $('[data-testid="button-ServiceLine.1.Clinic.1.EmptyState"]')
    }

    async selectLocation(location) {
        await (await this.chooseLocationDropdown).waitForClickable();
        await (await this.chooseLocationDropdown).click();
        await (await this.locationName(location)).isDisplayed();
        await (await this.locationName(location)).click();
    }


    async selectService(service) {
        await (await this.chooseServiceDropdown).click();
        await (await this.serviceName(service)).click();
    }

    async selectDate(date) {
        const today = new Date();
        const tomorrow = new Date(today);
        tomorrow.setDate(tomorrow.getDate() + 1);

        // Click on Choose Date dropdown
        await (await this.chooseDateDropdown).click();

        // Select the specified date
        const dayToSelect = date.getDate().toString();
        const dateOption = $(`[aria-disabled="false"][aria-label="${dayToSelect}"]
                    `);
        dateOption.click();


        // Get the selected date from the UI
        const selectedDateText = await (await this.selectedDate).getText();

        // Compare the selected date with the expected formatted date
        expect(selectedDateText).to.equal(date);
    }


    async clickSearch() {
        await (await this.searchButton).click();
    }

    async clickRefresh() {
        await (await this.refreshButton).click();
    }

    async clickClinicCare() {
        await (await this.clinicCareButton).click();
    }

    async clickVideoCare() {
        await (await this.videoCareButton).click();
    }

    async clickFirstAvailableSlot() {
        await (await this.firstAvailableSlot).click();
    }
    async clickNextAvailableDateButton() {
        await (await this.nextAvailableDateButton).waitForClickable();
        await (await this.nextAvailableDateButton).click();
    }

    async isServiceLineTitleDisplayed(service) {
        return await (await this.serviceLineTitle(service)).isDisplayed();
    }
}

module.exports = new SchedulePage();