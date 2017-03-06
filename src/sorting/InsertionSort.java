package sorting;

import java.util.Scanner;

/**
 * Created by a7madm on 3/6/17.
 */

// problem : https://www.hackerrank.com/challenges/insertionsort1
public class InsertionSort {


    public int[] takeInput(Scanner scanner) {
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void solveProblem(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                if (arr[i] > arr[x]) {
                    int value = arr[x];
                    for (int y = x; y > i; y--) {
                        arr[y] = arr[y - 1];
                        print(arr);
                    }
                    arr[i] = value;
                    print(arr);
                }
            }
        }
        //print(arr);
    }
}
