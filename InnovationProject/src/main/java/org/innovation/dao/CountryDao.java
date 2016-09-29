package org.innovation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.innovation.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao implements ICountryDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Country> getAllCountries() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Country> countryList = session.createQuery("from Country").list();
		return countryList;
	}

	public Country getCountry(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Country country = (Country) session.get(Country.class, new Integer(id));
		return country;
	}

	public Country addCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(country);
		return country;
	}

	public void updateCountry(Country country) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(country);
	}

	public void deleteCountry(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Country p = (Country) session.load(Country.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
