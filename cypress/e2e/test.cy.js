/// <reference types="Cypress" />

describe("ZoomCare - Search/Schedule Moment", () => {
  describe("Open and Select a Location from the list", () => {
    it("should filter and show the list of available services", () => {
      cy.visit("/");
      cy.get("[data-testid='quickSelector.location.popover']").should(
        "be.visible"
      );
    });
  });
});
