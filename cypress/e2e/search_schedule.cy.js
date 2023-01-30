/// <reference types="Cypress" />

import ClinicProviderPage from "../pages/ClinicProviderPage";
import ClinicServicesPage from "../pages/ClinicServicesPage";
import SchedulePage from "../pages/SchedulePage";
import SearchOptionsPage from "../pages/SearchOptionsPage";
import ServicesByLocation from "../fixtures/services_by_location.json";
import SearchClinics from "../fixtures/clinics.json";

const date = new Date();
const getDay = date.getDate() + 1;

describe("ZoomCare - Search/Schedule Moment", () => {
  context("Search for Clinics and displays the correct information", () => {
    before(() => {
      cy.navigateToZoomCare();
      cy.wait("@serviceLines");
      SchedulePage.elements.serviceLineSection().should("be.visible");
    });

    for (const clinic of SearchClinics) {
      it("should open and select a Location", () => {
        SearchOptionsPage.openLocationToggle();
        SearchOptionsPage.selectLocation(clinic.location);
      });

      it("should open and select a Service", () => {
        SearchOptionsPage.openServiceToggle();
        SearchOptionsPage.selectService(clinic.service);
      });

      it("should open, select a Date from Calendar and search", () => {
        SearchOptionsPage.openCalendarToggle();
        SearchOptionsPage.selectDateFromCalendar(getDay);
        SearchOptionsPage.clickOnSearch();
      });

      it("should open and select a Service", () => {
        SchedulePage.elements
          .serviceLineTitle()
          .should("contain.text", clinic.title);
        SchedulePage.elements.serviceLineSection().should("have.length", 6);
        SchedulePage.clickOnShowMore();
        SchedulePage.elements.serviceLineSection().should("have.length", 11);
      });
    }
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

    for (const service of ServicesByLocation) {
      it(`should select ${service.location} and display ${service.total_services} available services`, () => {
        SearchOptionsPage.openLocationToggle();
        SearchOptionsPage.selectLocation(service.location);
        SearchOptionsPage.openServiceToggle();
        SearchOptionsPage.elements
          .serviceOptions()
          .should("have.length", service.total_services);
      });
    }
  });
});
