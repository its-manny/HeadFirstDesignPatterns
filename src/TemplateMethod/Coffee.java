package TemplateMethod;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brewing coffee in filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
