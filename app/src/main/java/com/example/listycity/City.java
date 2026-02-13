package com.example.listycity;

/**
 *  This is a class that defines a city
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This gets the city's name
     * @return
     * Return String: city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * This gets the city's province
     * @return
     * Return String: city province
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two city names lexicographically. Returns negative int if name proceeds argument city's name, returns positive in if proceeds, and returns 0 if same.
     * @param o
     * This is the city to compare names to
     * @return
     * Return int: lexicographically before (-int), after (+int), or equal (0)
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /*
    Below function modified from:
    Author: Rafael del Nero https://www.infoworld.com/article/2256967/comparing-java-objects-with-equals-and-hashcode.html
    Title: Comparing Java objects with equals() and hashcode()
    Date: May 16, 2024
     */
    /**
     * This determines if two cities are equal in their values. Return true if they are the same, or have same values. Return false if not same values or null or not of the same class.
     * @param o
     * This is the city to compare values to
     * @return
     * Return true or false based on if cities are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City ocity = (City) o;
        return (city.equals(ocity.getCityName()) && province.equals(ocity.getProvinceName()));
    }
}
