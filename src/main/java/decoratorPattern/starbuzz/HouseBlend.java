package decoratorPattern.starbuzz;


public class HouseBlend extends Beverage {

    public HouseBlend(CoffeeSize size) {
        this.description = "House Blend Coffee";
        this.size = size;
    }

    public double cost() {
        return .89;
    }
}
