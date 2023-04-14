const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    baseUrl: 'https://www.zoomcare.com/schedule',
    // Client Default zoomcare provider city
    defaultProviderCity: 'Portland',
    // Client Alternate zoomcare provider city
    alternateProviderCity: 'Seattle',
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
