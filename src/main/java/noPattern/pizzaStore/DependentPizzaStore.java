package noPattern.pizzaStore;

import factoryPattern.pizzaStore.models.*;

public class DependentPizzaStore {
    public Pizza orderPizza(String style, String type){
        Pizza pizza = null;
        if(style.equals("NY")){
            if(type.equals("cheese")){
                pizza = new NYStyleCheesePizza();
            } else if(type.equals("clam")){
                pizza = new NYStyleClamPizza();
            }
        } else if (style.equals("Chicago")){
            if(type.equals("cheese")){
                pizza = new ChicagoStyleCheesePizza();
            } else if(type.equals("clam")){
                pizza = new ChicagoStyleClamPizza();
            }
        } else{
            System.out.println("Invalid Pizza style");
            return null;
        }

        assert pizza != null;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
