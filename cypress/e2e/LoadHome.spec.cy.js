describe('Load Home Page', () => {
  beforeEach(()=>{
    cy.visit(Cypress.config('baseUrl'));
  })
  it('Should load correctly with todays date', () => {
    var month = ""
    /*
    Find current 3 letter month based on test client Timezone
     */
    switch(new Date().getMonth()){
      case 0: month = "Jan"
            break;
      case 1: month = "Feb";
        break;
      case 3: month = "Apr";
            break;
      case 4: month = "May";
          break;
      case 5: month = "Jun";
          break;
      case 6: month = "Jul";
          break;
      case 7: month = "Aug";
      break;
      case 8: month = "Sep";
      break;
      case 9: month = "Oct";
      break;
      case 10: month = "Nov";
      break;
      case 11: month = "Dec";
      break;
    }
    cy.get('[data-testid="ServiceLine.1.Clinic.1.Provider.1.DateInfo"]').contains(month + " " + new Date().getDate())
  })
  it('should have correct default city', ()=>{
    cy.get('[data-testid="quickSelector.location.popover"]').contains("Portland, OR")
  })
})