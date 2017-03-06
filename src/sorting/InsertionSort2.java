package sorting;

import java.util.Scanner;

/**
 * Created by a7madm on 3/7/17.
 */

// problem https://www.hackerrank.com/challenges/insertionsort2
public class InsertionSort2 {

    public InsertionSort2() {

    }

    public int[] takeInput(Scanner scanner) {
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int x = i;

            while (array[x] > array[x + 1]) {
                //  System.out.println("Swapping " + array[x] + ", " + array[x + 1]);
                int item = array[x];
                array[x] = array[x + 1];
                array[x + 1] = item;
                x--;
                if (x < 0)
                    break;
            }
            print(array);
        }
    }

    private void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
