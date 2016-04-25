
package com.majesticbyte.neuralnets;

/**
 *
 * @author mkarjanm
 */
interface List<T> extends Iterable<T>{
    T get (int index);
    int size();
    void clear();
    boolean add(T item);
    
}
