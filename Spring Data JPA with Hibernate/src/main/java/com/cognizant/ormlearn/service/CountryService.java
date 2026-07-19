package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    @Transactional
    public List<Country> findCountryByName(String name) {
        return countryRepository.findByName(name);
    }

    @Transactional
    public List<Country> findCountryContaining(String text) {
        return countryRepository.findByNameContaining(text);

    }

    @Transactional
    public List<Country> getCountryByName(String name) {
        return countryRepository.getCountryByName(name);
    }


    // Pagination
    @Transactional
    public Page<Country> getCountryPage(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        return countryRepository.findAll(pageable);
    }

    // Sorting - Ascending
    @Transactional
    public List<Country> getCountriesSortedAscending() {

        return countryRepository.findAll(
                Sort.by("name").ascending()
        );
    }

    // Sorting - Descending
    @Transactional
    public List<Country> getCountriesSortedDescending() {

        return countryRepository.findAll(
                Sort.by("name").descending()
        );
    }
}