package decoratorPattern.starbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTest {

    private final double delta = 0.0001;

    private void showCost(Beverage beverage) {
        System.out.println(beverage.getSize() +
                ":" + beverage.getDescription() +
                ":$" + beverage.cost());
    }

    @Test
    void cost() {
        // Order one Espresso
        Beverage espresso = new Espresso(CoffeeSize.GRANDE);
        assertEquals(1.99, espresso.cost());
        showCost(espresso);
    }

    @Test
    void cost2() {
        // double Mocha with Whip
        Beverage beverage = new DarkRoast(CoffeeSize.VENTI);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        assertEquals(1.49, beverage.cost(), delta);
        showCost(beverage);
    }

    @Test
    void cost3() {
        // double mocha soy latte with whip
        Beverage tallSoyLatte = new HouseBlend(CoffeeSize.TALL);
        tallSoyLatte = new Soy(tallSoyLatte);
        tallSoyLatte = new Mocha(tallSoyLatte);
        tallSoyLatte = new Mocha(tallSoyLatte);
        tallSoyLatte = new Whip(tallSoyLatte);
        assertEquals(1.49, tallSoyLatte.cost(), delta);
        showCost(tallSoyLatte);
    }

    @Test
    void cost4() {
        Beverage grandSoyLatte = new HouseBlend(CoffeeSize.GRANDE);
        grandSoyLatte = new Soy(grandSoyLatte);
        grandSoyLatte = new Mocha(grandSoyLatte);
        grandSoyLatte = new Mocha(grandSoyLatte);
        grandSoyLatte = new Whip(grandSoyLatte);
        assertEquals(1.54, grandSoyLatte.cost(), delta);
        showCost(grandSoyLatte);
    }
}