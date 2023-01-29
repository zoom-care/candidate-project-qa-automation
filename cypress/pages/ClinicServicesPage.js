class ClinicServicesPage {
  elements = {
    clinicServicesButton: () => cy.contains("a", "View Clinic Services"),
    servicesSection: () => cy.get("#services"),
  };

  clickOnGoToClinicServices() {
    this.elements.clinicServicesButton().should("be.visible").click();
  }
}

module.exports = new ClinicServicesPage();
