package Strategy;

/**
 * Implements the STRATEGY design pattern.
 * The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently of clients that use it.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
