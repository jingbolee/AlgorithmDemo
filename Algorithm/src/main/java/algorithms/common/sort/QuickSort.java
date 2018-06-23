package algorithms.common.sort;

import algorithms.Utils;

/**
 * 快速排序
 * 通过一趟排序将待排记录分割成独立的两部分，其中一部分记录的是关键字均比另一部分记录的关键字小，
 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序的目的
 */
public class QuickSort {

    public static void quickSort(int[] array, int _left, int _right) {
        int left = _left;
        int right = _right;
        int temp;
        if (left > right) {
            return;
        }
        temp = array[left];
        while (left != right) {
            while (right > left && array[right] >= temp) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= temp) {
                left++;
            }
            array[right] = array[left];
        }
        array[right] = temp;
        Utils.printArray(array);
        quickSort(array, _left, left - 1);
        quickSort(array, right + 1, _right);

    }

    public static void main(String... args) {
        int[] a = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        QuickSort.quickSort(a, 0, a.length - 1);

    }
}
