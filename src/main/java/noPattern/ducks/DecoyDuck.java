package noPattern.ducks;

public class DecoyDuck extends Duck {
    public void display() {
        System.out.println("I am inheritance.DecoyDuck");
    }

    @Override
    public void fly() {
        System.out.println("I can not fly");
    }

    @Override
    public void quack() {
        System.out.println("I can not quack");
    }
}
