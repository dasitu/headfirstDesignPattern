package noPattern;

public abstract class Duck {
    public void quack() {
        System.out.println("inheritance.Duck::quack");
    }

    public void swim() {
        System.out.println("inheritance.Duck::swim");
    }

    public void fly(){
        System.out.println("inheritance.Duck::fly");
    }

    public abstract void display();
}
