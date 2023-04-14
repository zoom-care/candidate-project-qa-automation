describe('Filter Apts by city', () => {
    beforeEach(()=>{
        cy.visit(Cypress.config('baseUrl'));
    })
    it('should switch to correct alternate city', ()=>{
        cy.get('[data-testid="button-quickSelector.searchButton"]').should('be.visible')
        cy.wait(2000)
        cy.get('[data-testid="quickSelector.location.popover"]').click()
        cy.get('[data-testid="text-USE MY LOCATION"]').should('exist')
        cy.get('[data-testid^="text-quick-selector-option-location-"]').contains(Cypress.config('defaultProviderCity')).should('exist')
        cy.get('[data-testid^="text-quick-selector-option-location-]').contains(Cypress.config('alternateProviderCity')).click()
        cy.get('[data-testid="quickSelector.service.popover"]').click()
        cy.get('[data-testid="text-quick-selector-option-service-Illness/Injury"]').click()
        cy.wait(2000)
        cy.get('[data-testid="quickSelector.date.popover"]').click()
        cy.get('[data-testid="quickSelector.date.popover"]').contains("Today")
        cy.get('[data-testid="quickSelector.date.popover"]').click()
        cy.get('[data-testid="button-quickSelector.searchButton"]').click()
        cy.get('[data-testid="ServiceLine.1.Clinic.1.LocationRow"]').contains(Cypress.config('alternateProviderCity'))
    })
})