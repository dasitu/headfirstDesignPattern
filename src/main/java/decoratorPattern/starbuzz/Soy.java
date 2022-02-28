package decoratorPattern.starbuzz;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double additionalCost;
        switch (beverage.getSize()) {
            case TALL:
                additionalCost = 0.1;
                break;
            case GRANDE:
                additionalCost = 0.15;
                break;
            case VENTI:
                additionalCost = 0.2;
                break;
            default:
                throw new RuntimeException("No coffee size defined");
        }
        return additionalCost + beverage.cost();
    }
}
