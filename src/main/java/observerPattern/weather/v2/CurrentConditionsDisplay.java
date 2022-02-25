package observerPattern.weather.v2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

    private float temp;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    public void display() {
        System.out.println("Current Condition:" + temp + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            setTemp(weatherData.getTemp());
            setHumidity(weatherData.getHumidity());
            display();
        }
    }
}
