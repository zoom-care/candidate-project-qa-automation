class SearchOptionsPage {
  elements = {
    locationToggle: () => cy.getByTestId("quickSelector.locationSelector"),
    serviceToggle: () => cy.getByTestId("quickSelector.serviceSelector"),
    calendarToggle: () => cy.getByTestId("quickSelector.dateSelector"),
    locationContent: () =>
      cy.getByTestId("quickSelector.location.popoverContent"),
    serviceContent: () =>
      cy.getByTestId("quickSelector.service.popoverContent"),
    calendarContent: () => cy.getByTestId("quickSelector.date.popoverContent"),
    location: (location) =>
      cy.getByTestId(`text-quick-selector-option-location-${location}`),
    service: (service) =>
      cy.getByTestId(`text-quick-selector-option-service-${service}`),
    searchButton: () => cy.getByTestId("button-quickSelector.searchButton"),
    serviceOptions: () =>
      cy.getByPartialTestId("text-quick-selector-option-service-"),
  };

  openLocationToggle() {
    this.elements.locationToggle().should("be.visible").click();
    this.elements.locationContent().should("be.visible");
  }

  selectLocation(location) {
    this.elements.location(location).should("be.visible").click();
  }

  openServiceToggle() {
    this.elements.serviceToggle().should("be.visible").click();
    this.elements.serviceContent().should("be.visible");
  }

  selectService(service) {
    this.elements.service(service).should("be.visible").click();
    cy.wait(2000);
  }

  openCalendarToggle() {
    this.elements.calendarToggle().should("be.visible").click();
    this.elements.calendarContent().should("be.visible");
  }

  selectDateFromCalendar(date) {
    cy.contains(date).click();
  }

  clickOnSearch() {
    this.elements.searchButton().should("be.visible").click();
  }
}

module.exports = new SearchOptionsPage();
