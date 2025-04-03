package Compound.Quackables;

import Compound.Observer.Observable;
import Compound.Observer.Observer;

/**
 * This is a DECORATOR for quackables that provides counting behaviour
 */
public class QuackCounter implements Quackable {
    Quackable quackable;
    static int numQuacks;
    Observable observable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        quackable.quack();
        numQuacks++;
        notifyObservers();
    }
    public static int getQuacks() {
        return numQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
