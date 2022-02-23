package noPattern;

import noPattern.ducks.Duck;
import noPattern.ducks.MallardDuck;
import noPattern.ducks.RedHeadDuck;
import noPattern.ducks.RubberDuck;
import org.junit.jupiter.api.Test;

public class AllTest {

    @Test
    public void testMallardDuck(){
        Duck duck = new MallardDuck();
        duck.display();
        duck.fly();
    }

    @Test
    public void testRedHeadDuck(){
        Duck duck = new RedHeadDuck();
        duck.display();
        duck.fly();
    }

    @Test
    public void testRubberDuck(){
        Duck duck = new RubberDuck();
        duck.display();
        duck.fly();
    }
}
