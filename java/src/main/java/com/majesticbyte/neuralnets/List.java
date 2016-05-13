
package com.majesticbyte.neuralnets;

/**
 *
 * @author mkarjanm
 * @param <T>
 */
public interface List<T> extends Iterable<T>{
    T get (int index);
    int size();
    void clear();
    boolean add(T item);
    Object[] toArray();
}
