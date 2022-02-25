package observerPattern.weather.v1;

public class ForecastDisplay implements Observer, DisplayElement {

    private Subject subject;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        register();
    }

    public void register(){
        subject.registerObserver(this);
        // I can register someone else?
    }

    public void unregister(){
        subject.removeObserver(this);
        // I can unregister other observers from subject?
    }

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast: Improving weather on the way!");
    }
}
