package observerPattern.weather.v2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {

    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Forecast: Improving weather on the way!");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            display();
        }
    }
}
