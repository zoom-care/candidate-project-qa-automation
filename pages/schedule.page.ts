export enum Locations {
    UseMyLocation = 'Use my location',
    Portland = 'Portland, OR',
    Seattle = 'Seattle, WA',
    Vancouver = 'Vancouver, WA',
    Salem = 'Salem, OR',
    Eugene = 'Eugene, OR',
    Denver = 'Denver, CO',
    Boulder = 'Boulder, CO',
    Boise = 'Boise, ID'
}

export enum Cares {
    IllnessInjury = 'Illness/Injury',
    FluShot = '5-Minute Flu Shot',
    AdultCovidScreening = 'Adult COVID-19 Screening',
    PediatricCovidScreening = 'Pediatric COVID-19 Screening',
    PrimaryCare = 'Primary Care',
    SportsPhysical = 'Sports Physical'
}

class SchedulePage {
    public get locationLabel () {
        return $('[data-testid="text-scheduler.location.label"]');
    }

    public get locationSelector () {
        return $('[data-testid="LocationSelector"]');
    }

    public get useMyLocation () {
        return $('[data-testid="text-Use my location"]');
    }

    public get locationSearch () {
        return $('[data-testid="LocationSelector.search"]');
    }

    public get careSelectorTrigger () {
        return $('[data-testid="CareSelector.trigger"]');
    }

    public get spinner () {
        return $('[data-testid="text-Hang tight—finding your care."]');
    }

    public get loadingSpinner () {
        return $('[id="react-mount-loading"]');
    }

    public async selectLocation(location: Locations) {
        await (await this.loadingSpinner).waitForExist({ reverse: true });
        await (await this.spinner).waitForExist({ reverse: true });
        await this.locationLabel.click();
        await $(`[data-testid="text-${location}"]`).click();
    }

    public async selectCare(care: Cares) {
        await (await this.loadingSpinner).waitForExist({ reverse: true });
        await (await this.spinner).waitForExist({ reverse: true });
        await this.careSelectorTrigger.click();
        await $(`[data-testid="CareSelector.list.option.${care}"]`).click();
    }


    public async open () {
        await browser.url('https://www.zoomcare.com/schedule')
        await (await this.loadingSpinner).waitForExist({ reverse: true, timeout: 30000});
        await (await this.spinner).waitForExist({ reverse: true });
    }
}

export default new SchedulePage();
