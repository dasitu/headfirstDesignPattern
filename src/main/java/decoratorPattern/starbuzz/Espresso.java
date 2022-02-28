package decoratorPattern.starbuzz;


public class Espresso extends Beverage {

    public Espresso(CoffeeSize coffeeSize) {
        this.description = "Espresso";
        this.size = coffeeSize;
    }

    public double cost() {
        return 1.99;
    }
}
