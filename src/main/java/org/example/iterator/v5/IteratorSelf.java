package org.example.iterator.v5;

/**
 * E - element
 * T type
 * K - key
 * V - value
 *
 * @author MortonShaw
 * @date 2021/7/14 15:17
 */
interface IteratorSelf<E> {

    boolean hasNext();

    E next();

}
