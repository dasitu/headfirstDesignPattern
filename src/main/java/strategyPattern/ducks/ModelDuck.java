package strategyPattern.ducks;

import strategyPattern.ducks.behaviors.FlyNoWay;
import strategyPattern.ducks.behaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I am ModelDuck");
    }
}
