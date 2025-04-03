package Compound.Composites;

import Compound.Observer.Observable;
import Compound.Observer.Observer;
import Compound.Quackables.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<Quackable>();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        // Uses ITERATOR to make all ducks in Flock quack
        Iterator<Quackable> iterator = quackableList.iterator();
        while(iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> quackableIterator = quackableList.iterator();
        while(quackableIterator.hasNext()) {
            Quackable quackable = quackableIterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
