package algorithms;

import algorithms.test.Bank;
import algorithms.test.TransferRunnable;

import java.util.concurrent.locks.ReentrantLock;

public class Utils {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("-");
    }

    public static void main(String... args) {
        Bank b = new Bank(100, 1000);
        int i;
        for (i = 0; i < 100; i++) {
            TransferRunnable runnable = new TransferRunnable(b, i, 1000);
            Thread t = new Thread(runnable);
            t.start();
        }

        ReentrantLock lock = new ReentrantLock();

    }
}
