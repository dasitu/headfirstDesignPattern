package factoryPattern.pizzaStore.simpleFactory;

import factoryPattern.pizzaStore.models.Pizza;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
