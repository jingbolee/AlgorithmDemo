package algorithms.search;

/**
 * 二分查找，思路： 传入的关键字与中间记录进行比较，等于就返回，小于在左边查找，大于在右边查找
 * 需要保证查找的数组是排好序的
 */
public class BinarySearch {

    public int binarySearch(int[] array, int key) {
        if (array.length > 0) {
            int low = 0;
            int high = array.length - 1;
            while (low <= high) {
                int middle = (high + low) / 2;
                if (key == array[middle]) {
                    return array[middle];
                } else if (key < array[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public static void main(String... args) {
        int[] array = {1, 3, 4, 6, 7, 8, 9};
        BinarySearch search = new BinarySearch();
        int i = search.binarySearch(array, 9);
        System.out.println(i);
    }

}
