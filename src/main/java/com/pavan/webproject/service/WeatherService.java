package com.pavan.webproject.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pavan.webproject.model.Weather;

import org.json.JSONObject;

@Service
public class WeatherService {

    public Weather getWeatherReport(String city) {
        String apiKey = "your_api_key";  // Get your API key from OpenWeatherMap
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        
        // Parse the JSON response
        JSONObject jsonResponse = new JSONObject(response);
        String description = jsonResponse.getJSONArray("weather").getJSONObject(0).getString("description");
        double temperature = jsonResponse.getJSONObject("main").getDouble("temp");

        return new Weather(description, temperature, city);
    }
}
