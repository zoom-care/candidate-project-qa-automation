/// <reference types="Cypress" />

describe("This is your test project title", () => {
  it("This is your test case one title", () => {
    cy.visit("/");
    cy.get("[data-testid='quickSelector.location.popover']").should(
      "be.visible"
    );
  });
});
