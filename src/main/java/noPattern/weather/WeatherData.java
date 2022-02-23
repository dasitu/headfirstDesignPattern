package noPattern.weather;

public class WeatherData {
    public float getTemperature() {
        return 0;
    }

    public float getHumidity() {
        return 1;
    }

    public float getPressure() {
        return 2;
    }

    public void measurementsChanges() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}