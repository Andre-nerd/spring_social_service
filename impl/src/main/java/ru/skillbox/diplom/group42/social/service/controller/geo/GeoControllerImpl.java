package ru.skillbox.diplom.group42.social.service.controller.geo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.skillbox.diplom.group42.social.service.dto.geo.CityDto;
import ru.skillbox.diplom.group42.social.service.dto.geo.CountryDto;
import ru.skillbox.diplom.group42.social.service.service.geo.GeoService;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GeoControllerImpl implements GeoController {
    private final GeoService geoService;

    @Override
    public void loadCountries() throws Exception {
        log.info("Method loadCountries was executed in " + this.getClass().getName());
        geoService.loadCountries();
    }

    @Override
    public List<CountryDto> getCountries() {
        log.info("Method getCountries was executed in " + this.getClass().getName());
        return geoService.getAllCountries();
    }

    @Override
    public List<CityDto> getCities(@PathVariable Long countryId) {
        log.info("Method getCities was executed in " + this.getClass().getName());
        return geoService.getCitiesBy(countryId);
    }
}