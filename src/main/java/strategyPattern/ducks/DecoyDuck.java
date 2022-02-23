package strategyPattern.ducks;

public class DecoyDuck extends Duck {
    public void display() {
        System.out.println("I am inheritance.DecoyDuck");
    }

    public void fly() {
        System.out.println("I can not fly");
    }

    public void quack() {
        System.out.println("I can not quack");
    }
}
