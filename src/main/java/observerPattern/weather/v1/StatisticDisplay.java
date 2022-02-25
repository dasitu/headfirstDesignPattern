package observerPattern.weather.v1;

public class StatisticDisplay implements Observer, DisplayElement {

    private float temp;
    private Subject subject;

    public StatisticDisplay(Subject subject) {
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

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    public void update(float temp, float humidity, float pressure) {
        this.setTemp(temp);
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature:" + temp);
    }
}
