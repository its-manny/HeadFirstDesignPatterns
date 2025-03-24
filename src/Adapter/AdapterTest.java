package Adapter;

/**
 * Implements the CLASS ADAPTER Pattern.
 * The class adapter pattern converts the interface of a class into another interface the clients expect. Adapter lets
 * classes work together that couldn't otherwise because of incompatible interfaces.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        Turkey t = new WildTurkey();
        TurkeyAdapter tA = new TurkeyAdapter(t);

        System.out.println("Duck says:");
        duckTest(d);

        System.out.println("\nTurkeyAdaptor says:");
        duckTest(tA);
    }

    static void duckTest(Duck d) {
        d.quack();
        d.fly();
    }
}
