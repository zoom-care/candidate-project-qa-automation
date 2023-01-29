class SchedulePage {
  elements = {
    serviceLineTitle: () =>
      cy.getByTestId("text-scheduler.serviceLine.title-undefined"),
    serviceLineSection: () =>
      cy.getByPartialTestId("ServiceLine.1.ClinicSection"),
    showMoreButton: () =>
      cy.getByTestId("ServiceLine.1.ClinicSection.ShowMore"),
    clinicLotation: () =>
      cy.getByTestId("ServiceLine.1.Clinic.1.LocationRow").contains("a"),
    providerName: () =>
      cy.getByTestId("link-ServiceLine.1.Clinic.1.Provider.1.ProviderName"),
  };

  clickOnShowMore() {
    this.elements.showMoreButton().should("be.visible").click();
  }

  selectClinicLotation() {
    this.elements.clinicLotation().should("be.visible").click();
  }

  selectProvider() {
    this.elements.providerName().should("be.visible").click();
  }
}

module.exports = new SchedulePage();
