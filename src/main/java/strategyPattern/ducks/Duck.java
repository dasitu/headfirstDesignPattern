package strategyPattern.ducks;

import strategyPattern.ducks.behaviors.FlyBehavior;
import strategyPattern.ducks.behaviors.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("inheritance.Duck::swim");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
