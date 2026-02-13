package com.example.listycity;

import androidx.annotation.Nullable;

/**
 * This class defines a city and the provience in which it resides. It has getters and setters
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName() {
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        City testCity = (City) obj;
        return this.getCityName().equals(testCity.getCityName()) & this.getProvinceName().equals(testCity.getProvinceName());
    }
}
