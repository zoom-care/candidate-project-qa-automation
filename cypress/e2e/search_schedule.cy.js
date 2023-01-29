/// <reference types="Cypress" />

import ClinicProviderPage from "../pages/ClinicProviderPage";
import ClinicServicesPage from "../pages/ClinicServicesPage";
import SchedulePage, { selectClinicLotation } from "../pages/SchedulePage";
import SearchOptionsPage from "../pages/SearchOptionsPage";

const date = new Date();
const getDay = date.getDate() + 1;
const TITLE = "COVID-19 Screening Video Visit";

describe("ZoomCare - Search/Schedule Moment", () => {
  context("Search for Clinics and displays the correct information", () => {
    before(() => {
      cy.navigateToZoomCare();
      cy.wait("@serviceLines");
      SchedulePage.elements.serviceLineSection().should("be.visible");
    });

    it("should open and select a Location", () => {
      SearchOptionsPage.openLocationToggle();
      SearchOptionsPage.selectLocation("Seattle, WA");
    });

    it("should open and select a Service", () => {
      SearchOptionsPage.openServiceToggle();
      SearchOptionsPage.selectService("Adult COVID-19 Screening");
    });

    it("should open, select a Date from Calendar and search", () => {
      SearchOptionsPage.openCalendarToggle();
      SearchOptionsPage.selectDateFromCalendar(getDay);
      SearchOptionsPage.clickOnSearch();
    });

    it("should open and select a Service", () => {
      SchedulePage.elements.serviceLineTitle().should("contain.text", TITLE);
      SchedulePage.elements.serviceLineSection().should("have.length", 6);
      SchedulePage.clickOnShowMore();
      SchedulePage.elements.serviceLineSection().should("have.length", 11);
    });
  });

  context(
    "Clinic, Clinic Services and Provider details pages show the right information",
    () => {
      beforeEach(() => {
        cy.navigateToZoomCare();
        cy.wait("@serviceLines");
        SchedulePage.elements.serviceLineSection().should("be.visible");
      });

      it("should open and see the list of Clinic Services", () => {
        SchedulePage.selectClinicLotation();
        ClinicServicesPage.clickOnGoToClinicServices();
        ClinicServicesPage.elements.servicesSection().should("be.visible");
      });

      it("should open and see the Provider details", () => {
        SchedulePage.selectProvider();
        ClinicProviderPage.elements.providerName().should("be.visible");
      });
    }
  );

  context("List the services offered in a certain location", () => {
    before(() => {
      cy.navigateToZoomCare();
      cy.wait("@serviceLines");
      SchedulePage.elements.serviceLineSection().should("be.visible");
    });

    it("should select Portland and display 17 available services", () => {
      SearchOptionsPage.openLocationToggle();
      SearchOptionsPage.selectLocation("Portland, OR");
      SearchOptionsPage.openServiceToggle();
      SearchOptionsPage.elements.serviceOptions().should("have.length", 17);
    });

    it("should select Vancouver and display 9 available services", () => {
      SearchOptionsPage.openLocationToggle();
      SearchOptionsPage.selectLocation("Vancouver, WA");
      SearchOptionsPage.openServiceToggle();
      SearchOptionsPage.elements.serviceOptions().should("have.length", 9);
    });

    it("should select Boise and display 6 available services", () => {
      SearchOptionsPage.openLocationToggle();
      SearchOptionsPage.selectLocation("Boise, ID");
      SearchOptionsPage.openServiceToggle();
      SearchOptionsPage.elements.serviceOptions().should("have.length", 6);
    });
  });
});
