package Iterator;

/**
 * Implements the ITERATOR Pattern.
 * Provides a way to access the elements of an aggregate object sequentially without exposing its underlying
 * representation.
 */
public class IteratorTest {

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Alice alice = new Alice(pancakeHouseMenu, dinerMenu);

        alice.printMenu();
    }
}
