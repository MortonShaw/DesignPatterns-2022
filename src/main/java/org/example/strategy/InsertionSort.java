package org.example.strategy;

import java.util.Arrays;

/**
 * @author MortonShaw
 * @date 2021/7/5 13:05
 */
public class InsertionSort extends AbstractSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 9, 1, 0, 3, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 算法思路：当前指针和左侧的依次往右两两比较，右侧的小于左侧时，换位（或称为插入），类似反向冒泡
     * 比冒泡的优势是指针往右移动过程中，左侧肯定是排好序的
     * <p>
     * 最坏时间复杂度：O(n2)
     * 最好时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param arr 需要排序的数组
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

}
