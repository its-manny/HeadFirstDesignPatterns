package Compound.Factories;

import Compound.Quackables.Goose;
import Compound.Quackables.Quackable;

public interface AbstractGooseFactory {

    public abstract Goose createGoose();
    public abstract Quackable createGooseDuck();
}
