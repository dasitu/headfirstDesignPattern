package strategyPattern.ducks;

import strategyPattern.ducks.behaviors.FlyWithWings;
import strategyPattern.ducks.behaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am MallardDuck");
    }
}
