package Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerator<Object> implements Enumeration<Object> {
    Iterator<Object> it;

    public IteratorEnumerator(Iterator<Object> iterator) {
        it = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
