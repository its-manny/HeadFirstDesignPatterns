package Compound.Quackables;

public class QuackCounter implements Quackable {
    Quackable quackable;
    static int numQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numQuacks++;
    }
    public static int getQuacks() {
        return numQuacks;
    }
}
