package Singleton;

/**
 * Implements the SINGLETON pattern using an enum. This is thread-safe.
 */
public class EnumSingletonClient {
    public static void main(String[] args) {
        EnumSingleton enumSingleton1 = EnumSingleton.UNIQUE_INSTANCE;
        enumSingleton1.increment();
        System.out.println(enumSingleton1.getCounter());

        EnumSingleton enumSingleton2 = EnumSingleton.UNIQUE_INSTANCE;
        System.out.println(enumSingleton2.getCounter());

        enumSingleton2.increment();
        System.out.println(enumSingleton1.getCounter());
    }
    
}
