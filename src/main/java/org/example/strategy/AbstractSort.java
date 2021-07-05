package org.example.strategy;

/**
 * @author MortonShaw
 * @date 2021/7/5 13:21
 */
public class AbstractSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
