package algorithms.common.sort;

import algorithms.Utils;

/**
 * 简单选择排序
 * 通过 n-i 次关键字键间的比较，从 n-i+1 个记录中选出关键字最小的记录，并和第 i （1<=i<=n）个记录交换
 */
public class SimpleSelectionSort {

    public static void simleSelectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (i != min) {
                Utils.swap(array, i, min);
            }
        }
        Utils.printArray(array);
    }

    public static void main(String... args) {
        int[] a = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        SimpleSelectionSort.simleSelectionSort(a);
    }
}
