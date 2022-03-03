package noPattern.pizzaStore;

import factoryPattern.pizzaStore.models.NYStyleCheesePizza;
import factoryPattern.pizzaStore.models.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependentPizzaStoreTest {

    @Test
    void createPizza() {
        DependentPizzaStore pizzaStore = new DependentPizzaStore();
        Pizza actual = pizzaStore.orderPizza("NY", "cheese");
        assertTrue(actual instanceof NYStyleCheesePizza);
    }
}