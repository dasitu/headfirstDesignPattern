package factoryPattern.pizzaStore.simpleFactory;

import factoryPattern.pizzaStore.models.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    @Test
    void orderPizza() {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza actual = pizzaStore.orderPizza("cheese");
        assertTrue(actual instanceof CheesePizza);
    }
}