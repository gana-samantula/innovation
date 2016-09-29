package org.innovation.service;

import java.util.List;

import org.innovation.dao.CountryDao;
import org.innovation.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDao countryDao;
	
	@Transactional
	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	@Transactional
	public Country getCountry(int id) {
		return countryDao.getCountry(id);
	}

	@Transactional
	public void addCountry(Country country) {
		countryDao.addCountry(country);
	}

	@Transactional
	public void updateCountry(Country country) {
		countryDao.updateCountry(country);

	}

	@Transactional
	public void deleteCountry(int id) {
		countryDao.deleteCountry(id);
	}
}
