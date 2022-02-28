package decoratorPattern.starbuzz;

public abstract class Beverage {
    public String description = "Unknown Beverage";
    public CoffeeSize size;

    public CoffeeSize getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
