package TemplateMethod;

/**
 * Implements the TEMPLATE METHOD Pattern.
 * Defines the skeleton of an algorithm in a method, deferring some steps in subclasses. Template Method lets subclasses
 * redefine certain steps of an algorithm without changing the algorithm's structure.
 */
public class BeverageTest {

    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareBeverage();
        coffee.prepareBeverage();
    }
}
