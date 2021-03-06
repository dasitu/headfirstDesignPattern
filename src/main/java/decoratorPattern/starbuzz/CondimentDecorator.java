package decoratorPattern.starbuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public CoffeeSize getSize(){
        return beverage.getSize();
    }

}
