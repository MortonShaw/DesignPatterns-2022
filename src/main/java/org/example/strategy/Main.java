package org.example.strategy;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author MortonShaw
 * @date 2021/7/5 14:24
 */
public class Main {

    public static void main(String[] args) {
        Cat[] arr = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        InsertionSort<Cat> catInsertionSort = new InsertionSort<>();
        catInsertionSort.sort(arr, (o1, o2) -> {
            if (o1.getWeight() < o2.getWeight()) {
                return -1;
            } else if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    private static class InsertionSort<T> {
        void sort(T[] arr, Comparator<T> comparator) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (comparator.compare(arr[j], arr[j - 1]) == -1) {
                        T temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
    }

}
