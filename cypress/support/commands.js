Cypress.Commands.add("getByTestId", (selector, ...args) => {
  return cy.get(`[data-testid="${selector}"]`, ...args);
});

Cypress.Commands.add("getByPartialTestId", (selector, ...args) => {
  return cy.get(`[data-testid*="${selector}"]`, ...args);
});

Cypress.Commands.add("navigateToZoomCare", () => {
  cy.clearAllCookies();
  cy.clearAllLocalStorage();
  cy.visit("/");
  cy.intercept({
    url: `${Cypress.env("prodHost")}/schedule/service-lines`,
    method: "GET",
  }).as("serviceLines");
});
