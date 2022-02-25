package observerPattern.weather.v1;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
