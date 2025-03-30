package Composite;

/**
 * Implements the COMPOSITE Pattern.
 * Allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
 * individual objects compositions of objects uniformly.
 */
public class CompositeTest {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs and sausage",
                false,
                2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles",
                "Waffles with blueberries or strawberries",
                true,
                3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "Veggie bacon with lettuce and tomato on whole wheat",
                true,
                2.99));

        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce and tomato on whole wheat",
                false,
                2.99));

        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day with potato salad",
                false,
                3.29));

        dinerMenu.add(new MenuItem("Hot Dog",
                "Hot dog with relish and onions",
                false,
                3.05));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Chocolate Cake",
                "Tasty Chocolate Cake",
                true,
                1.99));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie Burger on a while wheat bun, fries",
                true,
                3.99));

        cafeMenu.add(new MenuItem("Soup of the day",
                "Soup of the day with side salad",
                false,
                3.69));

        cafeMenu.add(new MenuItem("Burrito",
                "Large burrito with whole pinto beans",
                true,
                4.29));

        Alice alice = new Alice(allMenus);
        alice.printMenu();
    }
}
