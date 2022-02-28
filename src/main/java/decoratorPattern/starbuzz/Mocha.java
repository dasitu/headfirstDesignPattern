package decoratorPattern.starbuzz;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public CoffeeSize getSize(){return beverage.getSize();}

    public double cost() {
        return 0.2 + beverage.cost();
    }
}
