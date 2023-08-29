const { config } = require('./wdio.conf.js');

config.capabilities[0]['goog:chromeOptions'] = {
    args: ['--headless', '--disable-gpu'],
};

exports.config = config;