package org.example.strategy;

import java.util.Arrays;

/**
 * @author MortonShaw
 * @date 2021/7/5 13:20
 */
public class BubbleSort extends AbstractSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 9, 1, 0, 3, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 算法思路：相邻位置两两比较，从左往右
     * 时间复杂度：O(n2)，优化之后的最好时间复杂度是O(n)
     * 空间复杂度：O(1)
     *
     * @param arr 需要排序的数组
     */
    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            // 记录未执行交换的次数
            int unSwapCount = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else {
                    unSwapCount++;
                }
                // 一次交换未执行，说明已经排好序，直接退出
                if (unSwapCount == i - 1) {
                    return;
                }
            }
        }
    }

}
