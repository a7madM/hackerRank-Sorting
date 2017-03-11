package sorting;

import java.util.Scanner;

/**
 * Created by a7madm on 3/11/17.
 */

//problem https://www.hackerrank.com/challenges/correctness-invariant
public class CorrectnessandtheLoopInvariant {

    public int[] takeInput(Scanner in) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
            printArray(array);
        }
        return array;
    }

    public void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}