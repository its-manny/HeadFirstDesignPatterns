package Composite;

import java.util.Iterator;

public class Alice {
    MenuComponent allMenus;

    public Alice(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
