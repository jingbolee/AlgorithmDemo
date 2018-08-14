package algorithms.common.sort;

import algorithms.Utils;

/**
 * 快排，先找一个记录，把大于他的放在右边，小的放在左边，然后采用递归的方式进行排序
 */
public class QuickSort2 {

    public void quickSort(int[] array) {
        if (array.length > 0) {
            doQuickSort(array, 0, array.length - 1);
        }
    }

    private void doQuickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int low = left;
        int high = right;
        int temp = array[low];
        while (low != high) {
            while (low < high && array[high] > temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[high] = temp;
        Utils.printArray(array);
        doQuickSort(array, left, low - 1);
        doQuickSort(array, high + 1, right);
    }

    public static void main(String[] args) {
        QuickSort2 qs = new QuickSort2();
        int[] a = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        qs.quickSort(a);
    }
}
