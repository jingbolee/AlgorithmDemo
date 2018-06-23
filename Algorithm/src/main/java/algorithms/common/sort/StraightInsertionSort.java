package algorithms.common.sort;

import algorithms.Utils;

/**
 * 插入排序：直接插入排序
 * 将一个记录插入到已经排好序的有序表中，从而得到一个新的，记录数增加1的有序表
 */
public class StraightInsertionSort {

    public static void straightInsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                Utils.swap(array, j, j - 1);
                j--;
            }
        }
        Utils.printArray(array);
    }

    public static void main(String... args) {
        int[] a = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        StraightInsertionSort.straightInsertSort(a);
    }
}
