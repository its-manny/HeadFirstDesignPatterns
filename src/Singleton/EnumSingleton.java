package Singleton;

public enum EnumSingleton {
    UNIQUE_INSTANCE;

    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {

        return counter;
    }

}

