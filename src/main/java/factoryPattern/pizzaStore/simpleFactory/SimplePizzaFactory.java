package factoryPattern.pizzaStore.simpleFactory;

import factoryPattern.pizzaStore.models.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza();
        }

        return pizza;
    }
}
