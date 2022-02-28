package noPattern.starbuzz;

public abstract class Beverage {
    String description;
    float milk;
    float soy;
    float mocha;
    float whip;

    public String getDescription() {
        return description;
    }

    public float cost(){
        return milk + soy + mocha + whip;
    }
}
