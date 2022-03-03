package factoryPattern.pizzaStore.factoryMethod;

import factoryPattern.pizzaStore.models.*;

public class NYStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza;

        if (pizzaType.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else {
            throw new RuntimeException("invalid pizzaType:" + pizzaType);
        }

        return pizza;
    }
}
