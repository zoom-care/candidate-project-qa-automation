describe('template spec', () => {
  beforeEach(() => {
    cy.on('uncaught:exception', (err, runnable) => {
      // returning false here prevents Cypress from
      // failing the test
      return false
  })
})
  it('Schedueling from home page', () => {
    cy.visit('https://www.zoomcare.com/')
    cy.get('[data-testid="text-Schedule your visit"]').should('be.visible').then(() => {
      cy.get('[data-testid="quickSelector.location.popover"]').should('be.visible').click().then(() => {
        cy.get('[data-testid="text-quick-selector-option-location-Portland, OR"]').should('be.visible').click().then(() => {
        cy.get('[data-testid="quickSelector.service.popover"]').should('be.visible').click().then(() => {
          cy.get('[data-testid="text-quick-selector-option-service-Dermatology"]').click().then(() => {
            cy.get('[data-testid="button-quickSelector.searchButton"]').click()
          })
        })
        })
      })
      })
    })

    it('Scheduling from Schedule Clinic Care', () => {
      cy.visit('https://www.zoomcare.com/schedule')
      cy.wait(7000)
      cy.get('[data-testid="quickSelector.location.popover"]').should('be.visible').then(() => {
        cy.get('[data-testid="text-quick-selector-option-location-Portland, OR"]').should('be.visible').click().then(() => {
          cy.get('[data-testid="quickSelector.service.popover"]').should('be.visible').then(() => {
            cy.get('[data-testid="text-quick-selector-option-service-Illness/Injury"]').should('be.visible').click()
            cy.get('[data-testid="button-quickSelector.searchButton"]').should('be.visible').click()
            cy.get('[data-testid="virtualClinicBox"]').should('be.visible').click()

        })
      })
      })
    })
    it('Scheduling from Schedule VirtualCare', () => {
      cy.visit('https://www.zoomcare.com/schedule')
      cy.wait(7000)
      cy.get('[data-testid="quickSelector.location.popover"]').should('be.visible').then(() => {
        cy.get('[data-testid="text-quick-selector-option-location-Portland, OR"]').should('be.visible').click().then(() => {
          cy.get('[data-testid="quickSelector.service.popover"]').should('be.visible').then(() => {
            cy.get('[data-testid="text-quick-selector-option-service-Illness/Injury"]').should('be.visible').click()
            cy.get('[data-testid="button-quickSelector.searchButton"]').should('be.visible').click()
            cy.get('[data-testid="virtualVideoBox"]').should('be.visible').click()
        })
      })
      })
    })
})