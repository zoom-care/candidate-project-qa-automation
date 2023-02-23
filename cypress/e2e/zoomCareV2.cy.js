const homePage = require('../fixtures/homePage.json');
const schedulePage = require('../fixtures/schedulePage.json');

describe('template spec', () => {
  beforeEach(() => {
    cy.on('uncaught:exception', (err, runnable) => {
      // returning false here prevents Cypress from
      // failing the test
      return false
  })
})
  it.only('Schedueling from home page', () => {
    cy.visit(homePage.url)
    cy.get(homePage.textBannerDiv).should('be.visible').then(() => {
      cy.wait(7000)
      cy.get(homePage.locationSelector).should('be.visible').click().then(() => {
        cy.get(homePage.locationPortland).should('be.visible').click().then(() => {
        cy.get(homePage.serviceSelector).should('be.visible').click().then(() => {
          cy.get(homePage.DermatologyService).click().then(() => {
            cy.get(homePage.searchButton).click()
          })
        })
        })
      })
      })
    })

    it('Scheduling from Schedule Clinic Care', () => {
      cy.visit(schedulePage.url)
      cy.wait(7000)
      cy.get(schedulePage.locationSelector).should('be.visible').then(() => {
        cy.get(schedulePage.locationPortland).should('be.visible').click().then(() => {
          cy.get(schedulePage.serviceSelector).should('be.visible').then(() => {
            cy.get(schedulePage.DermatologyService).should('be.visible').click()
            cy.get(schedulePage.searchButton).should('be.visible').click()
            cy.get(schedulePage.clinicCareButton).should('be.visible').click()
        })
      })
      })
    })
    it('Scheduling from Schedule VirtualCare', () => {
      cy.visit(schedulePage.url)
      cy.wait(7000)
      cy.get(schedulePage.locationSelector).should('be.visible').then(() => {
        cy.get(schedulePage.locationPortland).should('be.visible').click().then(() => {
          cy.get(schedulePage.serviceSelector).should('be.visible').then(() => {
            cy.get(schedulePage.DermatologyService).should('be.visible').click()
            cy.get(schedulePage.searchButton).should('be.visible').click()
            cy.get(schedulePage.videoCareButton).should('be.visible').click()
        })
      })
      })
    })
    it('Switching clinic care to virtual care', () => {
      cy.visit(schedulePage.url)
      cy.wait(7000)
      cy.get(schedulePage.locationSelector).should('be.visible').then(() => {
        cy.get(schedulePage.locationPortland).should('be.visible').click().then(() => {
          cy.get(schedulePage.serviceSelector).should('be.visible').then(() => {
            cy.get(schedulePage.DermatologyService).should('be.visible').click()
            cy.get(schedulePage.searchButton).should('be.visible').click()
            cy.get(schedulePage.clinicCareButton).should('be.visible').click().then(() => {
              cy.get(schedulePage.videoCareButton).should('be.visible').click()
            })
        })
      })
      })
    })
})