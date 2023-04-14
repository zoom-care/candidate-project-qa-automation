describe('Selecting an appointment', () => {
    it('Should trigger authentication required', () => {
        cy.visit(Cypress.config('baseUrl'));
        cy.get('[data-testid^="button-ServiceLine.1.Clinic.1.Provider.1.TimeSlot.1-"]').click()
        cy.get('[data-testid="button-loginModal.register.signUp"]').should('exist')
        cy.get('[data-testid="button-loginModal.register.logIn"]').should('exist')
        cy.get('[data-testid="text-NotificationBar-signup-or-login.message"]').contains("Please note: ZoomCare doesn’t accept Medicare Part B, Medicaid, or state-funded plans such as Apple Health and OHP. If you have any of these plans, we cannot provide you care under any circumstances. (Even if you pay out of pocket and don’t file a claim.")
    })
})