package factoryPattern.pizzaStore.models;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "NY Cheese dough";
        sauce = "NY Cheese Sauce";
        toppings.add("NY Cheese topping1");
        toppings.add("NY Cheese topping2");
        toppings.add("NY Cheese topping3");
    }
}
