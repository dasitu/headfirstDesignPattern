package factoryPattern.pizzaStore.models;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("==== Preparing " + name + " ====");
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: " + toppings);
    }

    public void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    protected String getFuncName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[3];//maybe this number needs to be corrected
        return e.getMethodName();
    }

    protected String getClassName() {
        return this.getClass().getSimpleName();
    }

    protected void echoClassAndFuncName() {
        System.out.println(getClassName() + "->" + getFuncName());
    }
}
