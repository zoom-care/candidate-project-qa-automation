
it('List of Clinics,video and chat Care Sanity Test',function(){

//-------------------------------------------------------STEP 1-------------------------------------------------------\\
        //---Press "VideoCare" button
        cy.visit('https://www.zoomcare.com/schedule')
        cy.wait(3000)
        cy.get('[data-testid="virtualVideoBox"]').click()

        //---List of clinics with today's available visits/windows should appear.
        cy.get('[data-testid="text-Today"]').should('contain', 'Today')
        cy.get('.css-1dbjc4n.r-18u37iz.r-1wyyakw').find('.css-901oao.r-mvpalk').invoke('text').each((text) => {
            console.log(text)
        })

})