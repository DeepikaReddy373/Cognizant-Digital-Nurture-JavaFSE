package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByName(String name);

    List<Country> findByNameContaining(String text);

    @Query("SELECT c FROM Country c WHERE c.name = :name")
    List<Country> getCountryByName(@Param("name") String name);

}