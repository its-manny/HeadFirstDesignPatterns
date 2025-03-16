package Decorator.Condiments;

import Decorator.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage
{
    Beverage beverage;

    public abstract String getDescription();
}
