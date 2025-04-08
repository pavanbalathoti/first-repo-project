package com.pavan.webproject.model;

public class Weather {

    private String description;
    private double temperature;
    private String city;

    public Weather(String description, double temperature, String city) {
        this.description = description;
        this.temperature = temperature;
        this.city = city;
    }

    // Getters and Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Weather in " + city + ": " + description + ", " + temperature + "°C";
    }
}
