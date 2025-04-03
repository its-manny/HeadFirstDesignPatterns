package Compound.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        //Notifies observers using ITERATOR
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(quackObservable);
        }
    }
}
