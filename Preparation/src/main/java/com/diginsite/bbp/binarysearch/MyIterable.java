package com.diginsite.bbp.binarysearch;

import java.util.Iterator;

public class MyIterable implements Iterable<Object> {
    private int i = 8;

    public boolean hasNext() {
        return i > 0;
    }

    public Object next() {
        return a[--i];
    }

    public void remove() {
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }

}
