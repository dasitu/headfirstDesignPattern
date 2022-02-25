package observerPattern.weather.v1;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private final ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
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

    public void setMeasurements(float temp, float humidity, float pressure){
        this.setTemp(temp);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        measurementsChanges();
    }

    public void measurementsChanges() {
        notifyObservers();
    }

    @Override
    public boolean registerObserver(Observer o) {
        return observers.add(o);
    }

    @Override
    public boolean removeObserver(Observer o) {
        return observers.removeIf(observer -> observer.equals(o));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temp, humidity, pressure));
    }
}