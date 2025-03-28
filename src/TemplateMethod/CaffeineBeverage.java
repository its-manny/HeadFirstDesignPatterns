package TemplateMethod;

public abstract class CaffeineBeverage {

    /**
     * This is the template method because it serves as a template for an algorithm
     */
    final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
