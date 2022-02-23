package strategyPattern;

import org.junit.jupiter.api.Test;
import strategyPattern.ducks.behaviors.FlyRocketPowered;
import strategyPattern.ducks.*;

public class AllTest {

    @Test
    public void testMallardDuck(){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }

    @Test
    public void testRedHeadDuck(){
        Duck duck = new RedHeadDuck();
        duck.display();
        duck.swim();
    }

    @Test
    public void testRubberDuck(){
        Duck duck = new RubberDuck();
        duck.display();
        duck.swim();
    }

    @Test
    public void testModelDuck(){
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
