package Compound;

import Compound.Composites.*;
import Compound.Observer.Quackologist;
import Compound.Quackables.*;
import Compound.Factories.*;

/**
 * Implements a COMPOUND of design patterns
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        duckSimulator.simulate(countingDuckFactory);
    }

    void simulate(AbstractDuckFactory abstractDuckFactory) {
        // Ducks are created using a FACTORY
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        // Ducks are added to a COMPOSITE
        Flock duckFlock = new Flock();
        duckFlock.add(mallardDuck);
        duckFlock.add(redheadDuck);
        duckFlock.add(duckCall);
        duckFlock.add(rubberDuck);

        Quackable mallard1 = abstractDuckFactory.createMallardDuck();
        Quackable mallard2 = abstractDuckFactory.createMallardDuck();
        Quackable mallard3 = abstractDuckFactory.createMallardDuck();

        Flock mallardFlock = new Flock();
        mallardFlock.add(mallard1);
        mallardFlock.add(mallard2);
        mallardFlock.add(mallard3);

        // COMPOSITES are nested
        duckFlock.add(mallardFlock);

        Quackologist quackologist = new Quackologist();
        duckFlock.registerObserver(quackologist);

        System.out.println("Running duck sim for all ducks...\n");
        simulate(duckFlock);

        System.out.println("\nRunning duck sim for just mallards...\n");
        simulate(mallardFlock);

        System.out.println("\nNumber of quacks was: " + QuackCounter.getQuacks());
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}
