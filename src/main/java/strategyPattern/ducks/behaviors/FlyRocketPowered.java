package strategyPattern.ducks.behaviors;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a Rocket.");
    }
}
