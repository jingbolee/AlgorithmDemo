package algorithms.common.sort;

import algorithms.Utils;

/**
 * 基础算法-冒泡排序
 * 基本思路：两两比较相邻记录的关键字，如果反序则交换，直到没有反序的记录为止
 */
public class BubbleSort {

    public static void baseBubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        Utils.printArray(array);
    }

    /**
     * 冒泡排序算法
     *
     * @param array
     */
    private static void bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 2; j >= i; j--) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        Utils.printArray(array);
    }

    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    Utils.swap(array, j, j + 1);
                }
            }
        }
        Utils.printArray(array);
    }

    /**
     * 改进的冒泡排序算法
     */
    private static void improveBubbleSort(int[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 2; j >= i; j--) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        Utils.printArray(array);
    }

    public static void main(String... args) {
        int[] a = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        BubbleSort.improveBubbleSort(b);
    }


}
