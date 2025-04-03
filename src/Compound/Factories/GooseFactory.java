package Compound.Factories;

import Compound.Quackables.Goose;
import Compound.Quackables.GooseAdapter;
import Compound.Quackables.Quackable;

public class GooseFactory implements  AbstractGooseFactory {
    @Override
    public Goose createGoose() {
        return new Goose();
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
