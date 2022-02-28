package noPattern.starbuzz;

public class DarkRoast extends Beverage{

    public  DarkRoast(){
        description = "I am a DarkRoast";
    }

    @Override
    public float cost() {
        float basicCost = super.cost();
        return basicCost + 100;
    }
}
