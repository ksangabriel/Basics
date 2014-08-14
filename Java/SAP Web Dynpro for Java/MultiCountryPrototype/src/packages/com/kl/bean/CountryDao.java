/*
 * Created on Aug 8, 2014
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.kl.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ksangabr
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CountryDao {
	
	private static List aclUserCountriesList   = new ArrayList();
	private static List availableCountriesList = new ArrayList();
	
	
	static {
		CountryBean a1 = new CountryBean();
		a1.setCountry("Malaysia");
		a1.setCountryCode("MY");
		
		CountryBean a2 = new CountryBean();
		a2.setCountry("Philippines");
		a2.setCountryCode("PH");
		
		CountryBean a3 = new CountryBean();
		a3.setCountry("Singapore");
		a3.setCountryCode("SG");				

		CountryBean a4 = new CountryBean();
		a4.setCountry("Thailand");
		a4.setCountryCode("TH");

		CountryBean a5 = new CountryBean();
		a5.setCountry("Indonesia");
		a5.setCountryCode("ID");
		
		availableCountriesList.add(a1);
		availableCountriesList.add(a2);
		availableCountriesList.add(a3);
		availableCountriesList.add(a4);
		availableCountriesList.add(a5);
		
		
		CountryBean b1 = new CountryBean();
		b1.setCountry("Malaysia");
		b1.setCountryCode("MY");
		
		CountryBean b2 = new CountryBean();
		b2.setCountry("Philippines");
		b2.setCountryCode("PH");
		
		aclUserCountriesList.add(b1);
		aclUserCountriesList.add(b2);

	}
	
	
	/**
	 * @return
	 */
	public List getAclUserCountriesList() {
		return aclUserCountriesList;
	}

	/**
	 * @return
	 */
	public List getAvailableCountriesList() {
		return availableCountriesList;
	}

	/**
	 * @param list
	 */
	public void setAclUserCountriesList(List list) {
		aclUserCountriesList = list;
	}

	/**
	 * @param list
	 */
	public void setAvailableCountriesList(List list) {
		availableCountriesList = list;
	}

}
