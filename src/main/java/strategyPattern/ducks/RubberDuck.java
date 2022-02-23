package strategyPattern.ducks;

public class RubberDuck extends Duck {
    public void display() {
        System.out.println("I am inheritance.RubberDuck");
    }

    public void fly() {
        System.out.println("I can not fly");
    }
}
