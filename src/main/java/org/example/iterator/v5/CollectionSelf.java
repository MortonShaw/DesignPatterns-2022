package org.example.iterator.v5;

/**
 * @author MortonShaw
 * @date 2021/7/14 15:15
 */
interface CollectionSelf<E> {

    void add(E o);

    int size();

    IteratorSelf<E> iterator();


}
