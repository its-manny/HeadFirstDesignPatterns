package Iterator;

import java.util.Iterator;

public class Alice {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Alice(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("MENU\n--------\nBREAKFAST");
        printMenu(pancakeHouseIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
