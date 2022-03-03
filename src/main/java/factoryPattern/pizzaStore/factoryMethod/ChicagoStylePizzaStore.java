package factoryPattern.pizzaStore.factoryMethod;

import factoryPattern.pizzaStore.models.ChicagoStyleCheesePizza;
import factoryPattern.pizzaStore.models.ChicagoStyleClamPizza;
import factoryPattern.pizzaStore.models.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza;

        if (pizzaType.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else {
            throw new RuntimeException("invalid pizzaType:" + pizzaType);
        }

        return pizza;
    }
}
