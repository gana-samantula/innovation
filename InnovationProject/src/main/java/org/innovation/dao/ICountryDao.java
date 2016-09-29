package org.innovation.dao;

import java.util.List;

import org.innovation.model.Country;

public interface ICountryDao {

    public List<Country> getAllCountries();

    public Country getCountry(int id);

    public Country addCountry(Country country);

    public void updateCountry(Country country);

    public void deleteCountry(int id);

}
