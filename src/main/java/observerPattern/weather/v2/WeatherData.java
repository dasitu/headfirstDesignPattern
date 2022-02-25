package observerPattern.weather.v2;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        setTemp(temp);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

}