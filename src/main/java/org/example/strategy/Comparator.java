package org.example.strategy;

/**
 * @author MortonShaw
 * @date 2021/7/5 15:33
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1, T o2);

}
