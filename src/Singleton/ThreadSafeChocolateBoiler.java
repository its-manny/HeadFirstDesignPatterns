package Singleton;

/**
 * Thread-safe SINGLETON Pattern implementation with lazy instantiation. Uses double-checked locking.
 * Ensures a class has only one instance, and provides a global point of access to it.
 */
public class ThreadSafeChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    /**
     * This could be declared as private static and instantiated here (eagerly created) if lazy instantiation isn't
     * required. This is thread-safe.
     */
    private volatile static ThreadSafeChocolateBoiler chocolateBoiler;

    private ThreadSafeChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * Uses double-checked locking; note that synchronization only occurs the first time (i.e. when the singleton
     * instance doesn't exist). This whole method could be synchronized instead if the performance overhead is
     * acceptable.
     */
    public ThreadSafeChocolateBoiler getInstance() {
        if(chocolateBoiler == null) {
            synchronized (ThreadSafeChocolateBoiler.class) {
                if(chocolateBoiler == null) {
                    chocolateBoiler = new ThreadSafeChocolateBoiler();
                }
            }
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
