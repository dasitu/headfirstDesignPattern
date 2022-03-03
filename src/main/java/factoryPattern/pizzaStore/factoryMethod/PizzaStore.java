package factoryPattern.pizzaStore.factoryMethod;

import factoryPattern.pizzaStore.models.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaType){
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaType);
}
