package decoratorPattern.starbuzz;


public class DarkRoast extends Beverage {

    public DarkRoast(CoffeeSize size) {
        this.description = "DarkRoast";
        this.size = size;
    }

    public double cost() {
        return 0.99;
    }
}
