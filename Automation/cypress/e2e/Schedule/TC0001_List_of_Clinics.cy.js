
it('Schedule page - List of Clinics Sanity Test',function(){

//-------------------------------------------------------STEP 1-------------------------------------------------------\\

           //---Navigate to https://www.zoomcare.com/schedule
           cy.visit(Cypress.env('schedule_url'))

           //---Zoomcare logo top-right, Schedule, Locations, Services, Pricing & Insurance links, and Login button should be visible.
           cy.wait(3000)

           cy.contains('Want care in').click()
           cy.contains('Seattle').click() //Changes city to Seattle, as there's no care in my area yet

           cy.get('.nav__brand > .image-4').should('be.visible')
           cy.get('.nav__main__container').should('contain', 'Schedule')
           .and('contain', 'Locations')
           .and('contain', 'Services')
           .and('contain', 'Pricing & Insurance')
           .and('contain', 'Login')

           //---"Want care in X?" should be shown based on the location of the user.
           cy.get('[data-testid="LocationSelector"]').should('contain', 'Want care in')

           //---"Illness/Injury" and "Today" shown by default from a dropdown menu.
           cy.get('[data-testid="text-Illness/Injury"]').should('contain', 'Illness/Injury')
           cy.get('[data-testid="text-Today"]').should('contain', 'Today')

           //---The buttons "Clinic Care", "VideoCare" and "ChatCare" are visible, "Clinic Care" button is selected.
           cy.get('[data-testid="virtualClinicBox"]').should('be.visible')
           .and('have.css', 'background-color')
           .and('eq', 'rgb(46, 66, 74)')
           cy.get('[data-testid="virtualVideoBox"]').should('be.visible')
           cy.get('[data-testid="virtualChatBox"]').should('be.visible')

           //---"Illness/Injury Clinic Visit title, followed by the "Info $" link are visible.
           cy.get('[data-testid="ServiceLine.1"] > [style="border-color: rgb(219, 219, 219) rgb(219, 219, 219) rgb(95, 93, 93); border-width: 1px 1px 2px; padding: 16px;"]')
           .should('contain', 'Illness/Injury Clinic Visit')
           .and('contain', 'Info | $')

           //---List of Clinics should contain 5 or fewer options - Other options are hidden under the "Show More" button.
           cy.get('[data-testid="ServiceLine.1.ClinicSection"]').its('length').should('be.lte', 5)
           cy.get('[data-testid="ServiceLine.1.ClinicSection"]').eq(0).should('contain', 'View Clinic Services')
           .and('contain', 'Map') //Verify the if the links "View Clinic Services" and "Map" are visible

           //---Right under the list of clinics, "Emergency Care" list should be visible followed by the "Info $" link.
           cy.get('[data-testid="ServiceLine.2"] > [style="border-color: rgb(219, 219, 219) rgb(219, 219, 219) rgb(95, 93, 93); border-width: 1px 1px 2px; padding: 16px;"]')
           .should('contain', 'Emergency Care')
           .and('contain', 'Info | $')

           cy.log('TEST STEP 1 DONE')

//-------------------------------------------------------STEP 2-------------------------------------------------------\\

           //---Press on "Want care in X?" and choose Denver
           cy.contains('Want care in').click()
           cy.contains('Denver').click()

           //---List of clinics in Denver should appear - If less then 5, "Show more" button should not be visible.
           cy.get('.css-1dbjc4n').find('[data-testid="ServiceLine.1.ClinicSection"]').then((clinics) =>{
           const clincs_length = Cypress.$(clinics).length //The number of visible clinics in the list
           if (clincs_length < 5){
           //TODO - CODE WILL FAIL HERE - NEED TO CLARIFY IF THE "SHOW MORE" BUTTON IS EXPECTED
                cy.get('[data-testid="ServiceLine.1.ClinicSection.ShowMore"]').should('not.be.visible')
           }
           else{
                cy.get('[data-testid="ServiceLine.1.ClinicSection.ShowMore"]').should('be.visible')
           }
           })

           //---Under "Emergency Care" the message "We're not in your area yet—but we're growing almost as fast as
           //---we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more." should be visible.
           cy.get('[data-testid="text-We\'re not in your area yet—but we\'re growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more."]')
           .should('contain', 'We\'re not in your area yet—but we\'re growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more.')

           cy.log('TEST STEP 2 DONE')

//-------------------------------------------------------STEP 3-------------------------------------------------------\\

           //---Press the "Info $" Link next to the Clinic Visit title
           cy.get('[data-testid="ServiceLine.1"] > [style="border-color: rgb(219, 219, 219) rgb(219, 219, 219) rgb(95, 93, 93); border-width: 1px 1px 2px; padding: 16px;"] > .r-18u37iz > .r-1loqt21 > [data-testid="text-scheduler.serviceLine.info-undefined"]')
           .click()

           //---The correct info should appear with the link "More info" that takes the user to the page
           //---https://www.zoomcare.com/services/illness-injury-clinic-visit
           cy.get('[data-testid="text-More Info"]').click()
           cy.url().should('eq', 'https://www.zoomcare.com/services/illness-injury-clinic-visit')

           cy.log('TEST STEP 3 DONE')

//-------------------------------------------------------STEP 4-------------------------------------------------------\\

           //---Press "Schedule" in the navigation bar and repeat step 3 for the "Emergency Care" section
           cy.get('#nav-schedule').click()
           cy.wait(2000)
           cy.get('[data-testid="ServiceLine.2"] > [style="border-color: rgb(219, 219, 219) rgb(219, 219, 219) rgb(95, 93, 93); border-width: 1px 1px 2px; padding: 16px;"] > .r-18u37iz > .r-1loqt21 > [data-testid="text-scheduler.serviceLine.info-undefined"]')
           .click()

           //---The correct info should appear with the link "More info" that takes the user to the page
           //---https://www.zoomcare.com/services/emergency-care
           cy.get('[data-testid="text-More Info"]').click()
           cy.url().should('eq', 'https://www.zoomcare.com/services/emergency-care')

           cy.log('ALL TEST STEPS PASSED')

})
