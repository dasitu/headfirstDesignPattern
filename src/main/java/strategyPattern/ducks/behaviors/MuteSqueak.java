package strategyPattern.ducks.behaviors;

public class MuteSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<...silent...>");
    }
}
