
package com.majesticbyte.neuralnets;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author mkarjanm
 * @param <T> object type template
 */
public class ArrayList<T> implements List<T> {

    private Object[] items;
    private int itemCount;
    private int limitIndex;

    public ArrayList() {
        this.items = new Object[32];
        this.limitIndex = 31;
        this.itemCount = 0;
    }

    public ArrayList(List<T> other) {
        int size = other.size();
        items = other.toArray();
        itemCount = size;
        this.limitIndex = size-1;      
    }   
    
    public ArrayList(Collection<? extends T> c)
    {
        int size = c.size();
        items = c.toArray();
        itemCount = size;
        this.limitIndex = size-1;  
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
        this.itemCount = 0;
        this.items = new Object[32];
        this.limitIndex = 31;
    }

    @Override
    public boolean add(T item) {
        if (itemCount == limitIndex) {
            limitIndex = (limitIndex << 1) | 1;
            Object[] newcontainer = new Object[limitIndex];
            System.arraycopy(items, 0, newcontainer, 0, itemCount);
            items = newcontainer;
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

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[itemCount];
        System.arraycopy(items, 0, newArray, 0, itemCount);
        return newArray;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(this.toArray());
    }

    // Inner class example
    private class ListIterator<T> implements
            Iterator<T> {

        private int cursor;
        private final ArrayList<T> list;

        public ListIterator(ArrayList<T> list) {
            this.cursor = 0;
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return list.size() > cursor;
        }

        @Override
        public T next() {
            if (this.hasNext()) {
                return list.get(cursor++);
            }
            throw new NoSuchElementException();           
        }

        @Override
        public void remove() {
            //TODO: implement
            throw new UnsupportedOperationException();
        }
    }
}
