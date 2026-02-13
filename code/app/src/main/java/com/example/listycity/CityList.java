package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of City objects
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

    public void delete(City city){
        if (cities.contains(city))
            cities.removeIf(city::equals);
        else
            throw new IllegalArgumentException();
    }

    public  boolean hasCity(City city){
        for(City testCity: cities){
            if (city.equals(testCity)){
                return true;
            }
        }
        return false;
    }

    public int countCities(){
        return cities.size();
    }

}
