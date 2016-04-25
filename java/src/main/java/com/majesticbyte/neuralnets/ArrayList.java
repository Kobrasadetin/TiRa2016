
package com.majesticbyte.neuralnets;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author mkarjanm
 */
public class ArrayList<T> implements List<T> {

    private Object[] items;
    private int itemCount;
    private int limitIndex;

    ArrayList() {
        this.items = new Object[32];
        this.limitIndex = 31;
        this.itemCount = 0;
    }

    ArrayList(List<T> other) {
        int size = other.size();
        items = new Object[size];
        this.limitIndex = size-1;
        //TODO: implement toArray in List and arraycopy here
        for (int i = 0; i < size; i++)
        {
            this.add(other.get(i));
        }
    }

    @Override
    public T get(int index) {
        inRange(index);
        return (T) items[index];
    }

    @Override
    public int size() {
        return itemCount;
    }

    @Override
    public void clear() {
        itemCount = 0;
        items = new Object[32];
    }

    @Override
    public boolean add(T item) {
        if (itemCount == limitIndex) {
            Object[] newcontainer = new Object[limitIndex + 32];
            System.arraycopy(items, 0, newcontainer, 0, itemCount);
            items = newcontainer;
            limitIndex+=32;
        }
        items[itemCount++] = item;
        return true;
    }

    private void inRange(int index) {
        if (index >= itemCount) {
            throw new IndexOutOfBoundsException("index out of bounds: " + index);
        }
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this);
    }

    // Inner class example
    private class ListIterator<T> implements
            Iterator<T> {

        private final int cursor;
        private final ArrayList<T> list;

        public ListIterator(ArrayList<T> list) {
            this.cursor = 0;
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return list.size() <= cursor;
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                return list.get(cursor);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
