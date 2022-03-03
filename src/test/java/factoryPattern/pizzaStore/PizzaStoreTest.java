package factoryPattern.pizzaStore;

import factoryPattern.pizzaStore.models.Pizza;
import factoryPattern.pizzaStore.factoryMethod.ChicagoStylePizzaStore;
import factoryPattern.pizzaStore.factoryMethod.NYStylePizzaStore;
import factoryPattern.pizzaStore.factoryMethod.PizzaStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
    PizzaStore nyPizzaStore = new NYStylePizzaStore();

    @Test
    void orderNYCheesePizza() {
        Pizza actual = nyPizzaStore.orderPizza("cheese");
        assertEquals("NYStyleCheesePizza", actual.getClass().getSimpleName());
        assertEquals("NY Style Cheese Pizza", actual.getName());
    }

    @Test
    void orderChicagoCheesePizza() {
        String expectedPizza = "ChicagoStyleCheesePizza";
        String pizzaType = "cheese";
        Pizza actual = chicagoPizzaStore.orderPizza(pizzaType);
        assertEquals(expectedPizza, actual.getClass().getSimpleName());
        assertEquals("Chicago Style Cheese Pizza", actual.getName());
    }

    @Test
    void orderChicagoClamPizza() {
        String expectedPizza = "ChicagoStyleClamPizza";
        String pizzaType = "clam";
        Pizza actual = chicagoPizzaStore.orderPizza(pizzaType);
        assertEquals(expectedPizza, actual.getClass().getSimpleName());
        assertEquals("Chicago Style Clam Pizza", actual.getName());
    }

    @Test
    void orderNYClamPizza() {
        String expectedPizza = "NYStyleClamPizza";
        String pizzaType = "clam";
        Pizza actual = nyPizzaStore.orderPizza(pizzaType);
        assertEquals(expectedPizza, actual.getClass().getSimpleName());
        assertEquals("NY Style Clam Pizza", actual.getName());
    }

    @Test
    void invalidPizzaType() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> nyPizzaStore.orderPizza("ut-invalid"));
        assertTrue(exception.getMessage().startsWith("invalid pizzaType:"));
    }
}