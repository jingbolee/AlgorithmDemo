package algorithms.search;

/**
 * 二分查找，思路： 传入的关键字与中间记录进行比较，等于就返回，小于在左边查找，大于在右边查找
 * 需要保证查找的数组是排好序的
 */
public class BinarySearch {

    /**
     * 二分查找
     */
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

    // 查找第一个与key相等的元素
    // 查找第一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最左边的元素下标。
    public int binarySearchFirst(int[] array, int key) {
        if (array.length > 0) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[mid] >= key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (left < array.length && array[left] == key) {
                return left;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    // 查找最后一个与key相等的元素
    //查找最后一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最右边的元素下标。
    public int binarySeayrchEnd(int[] array, int key) {
        if (array.length > 0) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (right >= 0 && array[right] == key) {
                return right;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public static void main(String... args) {
        int[] array = {1, 2, 3, 3, 4, 6, 7, 8, 9};
        BinarySearch search = new BinarySearch();
//        int i = search.binarySearch(array, 9);
        int i = search.binarySeayrchEnd(array, 3);
        System.out.println(i);
    }

}
