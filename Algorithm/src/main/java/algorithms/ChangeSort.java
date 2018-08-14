package algorithms;

/**
 * 输入一个整型数组，实现一个函数来调整该数组中的数字的顺序，使得所有奇数位于数组的前半部分，
 * 所有偶数位于数组的后半部分，希望时间复杂度尽量小。
 * 解决思路：类似快排,奇数除以2用余数做判断
 */
public class ChangeSort {


    public static void changeSort(int[] array) {
        if (array.length <= 0) {
            return;
        }
        int head = 0;
        int end = array.length - 1;
        int temp;
        while (head != end) {
            while (end > head && array[head] / 2 != 0) {
                head++;
            }
            temp = head;
            while (end > head && array[end] != 1) {
                end--;
            }
            array[head] = array[end];
            array[end] = array[temp];
        }
        Utils.printArray(array);

    }

    public static void main(String... args) {
        int[] atr = new int[]{1, 2, 3, 4, 5};
        changeSort(atr);
    }
}
