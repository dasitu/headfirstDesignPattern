package observerPattern.weather;

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
    }
}