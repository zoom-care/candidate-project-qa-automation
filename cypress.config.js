const { defineConfig } = require("cypress");

module.exports = defineConfig({
  // Global configuration: These settings are applicable for both e2e and component
  videoUploadOnPasses: false,
  watchForFileChanges: false,
  viewportHeight: 1080,
  viewportWidth: 1920,
  chromeWebSecurity: false,
  defaultCommandTimeout: 10000,
  retries: {
    runMode: 2,
    openMode: 0,
  },
  reporter: "cypress-mochawesome-reporter",
  video: false,
  reporterOptions: {
    charts: true,
    reportPageTitle: "Cypress Saucedemo Report",
    embeddedScreenshots: true,
    inlineAssets: true, //Adds the asserts inline
    saveAllAttempts: false,
  },
  // E2E section: Options that are applicable only for e2e tests
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      require("cypress-mochawesome-reporter/plugin")(on);
    },
    baseUrl: "https://www.zoomcare.com/schedule",
    testIsolation: false,
  },
});
