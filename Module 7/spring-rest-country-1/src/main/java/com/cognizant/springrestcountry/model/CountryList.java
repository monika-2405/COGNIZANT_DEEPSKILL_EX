package com.cognizant.springrestcountry.model;

import java.util.List;

import com.cognizant.springrestcountry.model.Country;

public class CountryList {

    private List<Country> countryList;

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}