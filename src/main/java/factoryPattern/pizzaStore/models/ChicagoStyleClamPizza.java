package factoryPattern.pizzaStore.models;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Chicago Clam dough";
        sauce = "Chicago Clam Sauce";
        toppings.add("Chicago Clam topping1");
        toppings.add("Chicago Clam topping2");
        toppings.add("Chicago Clam topping3");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
