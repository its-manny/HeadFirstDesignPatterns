package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "Veggie bacon with lettuce and tomato on whole wheat",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce and tomato on whole wheat",
                false,
                2.99);

        addItem("Soup of the day",
                "Soup of the day with potato salad",
                false,
                3.29);

        addItem("Hot Dog",
                "Hot dog with relish and onions",
                false,
                3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
