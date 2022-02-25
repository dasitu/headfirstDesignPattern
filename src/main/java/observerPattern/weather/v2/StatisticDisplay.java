package observerPattern.weather.v2;

import java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer {

    private float temp;
    private Observable observable;

    public StatisticDisplay(Observable observable) {
        setObservable(observable);
        observable.addObserver(this);
    }

    public void setObservable(Observable observable){
        this.observable = observable;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature:" + temp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            setTemp(weatherData.getTemp());
            display();
        }
    }
}
