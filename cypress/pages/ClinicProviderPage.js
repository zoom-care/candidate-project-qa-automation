class ClinicProviderPage {
  elements = {
    providerName: () => cy.getByTestId("ProviderSummary"),
  };
}

module.exports = new ClinicProviderPage();
