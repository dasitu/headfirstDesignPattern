package factoryPattern.pizzaStore.models;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Chicago Cheese dough";
        sauce = "Chicago Cheese Sauce";
        toppings.add("Chicago Cheese topping1");
        toppings.add("Chicago Cheese topping2");
        toppings.add("Chicago Cheese topping3");
    }
}
