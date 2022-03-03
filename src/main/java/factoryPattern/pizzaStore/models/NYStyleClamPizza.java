package factoryPattern.pizzaStore.models;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "NY Clam dough";
        sauce = "NY Clam Sauce";
        toppings.add("NY Clam topping1");
        toppings.add("NY Clam topping2");
        toppings.add("NY Clam topping3");
    }
}
