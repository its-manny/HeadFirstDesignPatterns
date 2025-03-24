package Adapter;

import java.util.ArrayList;
import java.util.Enumeration;

public class IteratorTest {

    public static void main(String[] args) {
        EnumArrayList<String> enumArrayList = new EnumArrayList<String>();
        enumArrayList.add("foo");
        enumArrayList.add("bar");
        enumArrayList.add("oof");
        enumArrayList.add("rab");

        Enumeration<String> enumeration = enumArrayList.enumerator();

        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }

    }
}
