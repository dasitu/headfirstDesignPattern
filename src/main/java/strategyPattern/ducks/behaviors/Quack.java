package strategyPattern.ducks.behaviors;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("All normal quack");
    }
}
