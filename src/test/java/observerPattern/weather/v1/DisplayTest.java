package observerPattern.weather.v1;

import org.junit.jupiter.api.Test;

class DisplayTest {

    @Test
    void display() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(2,3,4);
//        weatherData.setMeasurements(3,4,5);
    }
}