package observerPattern.weather.v1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
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

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        this.setTemp(temp);
        this.setHumidity(humidity);
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition:" + temp + "F degrees and " + humidity + "% humidity");
    }
}
