class Page {

    async open() {
        await browser.url('https://www.zoomcare.com/schedule');
    }
}

module.exports = new Page();