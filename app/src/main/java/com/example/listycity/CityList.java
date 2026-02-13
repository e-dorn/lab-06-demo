package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns whether or not a given city is in the list
     * @param city
     * This is a city to check it it exist in the list
     * @return
     * Return true or false
     */

    public boolean hasCity(City city) {
        for (City currCity : cities) {
            if (city.equals(currCity)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This checks if a city is present in the list. If it does then remove it from the list, if not then throw an exception
     * @param city
     * This is a city to remove from the list
     */

    public void delete(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException("City to be deleted is not in list");
        }
    }

    /**
     * This returns how many cities are in the list
     * @return
     * Return int: length of the city list
     */

    public int countCities() {
        return cities.toArray().length;
    }

}
