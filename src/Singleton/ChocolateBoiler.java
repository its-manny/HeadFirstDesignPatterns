package Singleton;

/**
 * Classic SINGLETON Pattern implementation with lazy instantiation.
 * This is not thread-safe due to two threads being able to concurrently call getInstance (creating two instances)
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public ChocolateBoiler getInstance() {
        if(chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
