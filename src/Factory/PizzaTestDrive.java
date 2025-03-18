package Factory;

/**
 * Implements the FACTORY pattern.
 * Defines as interface for creating an object, but lets subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Manny ordered a " + pizza.getName() + "\n");
    }
}
