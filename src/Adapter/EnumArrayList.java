package Adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumArrayList<Object> extends ArrayList<Object> {
    IteratorEnumerator<Object> iteratorEnumerator;

    public EnumArrayList() {
        iteratorEnumerator = new IteratorEnumerator<>(iterator());
    }


    public Enumeration<Object> enumerator() {
        return iteratorEnumerator;
    }
}
