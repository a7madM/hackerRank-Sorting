package main;

import sorting.CorrectnessandtheLoopInvariant;
import sorting.InsertionSort;
import sorting.InsertionSort2;
import sorting.TutorialIntro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testInsetionSort3();
    }

    private static void testInsetionSort3() {
        Scanner scanner = new Scanner(System.in);
        CorrectnessandtheLoopInvariant insertionSort = new CorrectnessandtheLoopInvariant();
        int arr[] = insertionSort.takeInput(scanner);
        arr = insertionSort.insertionSort(arr);
        insertionSort.printArray(arr);
    }

    private static void testInsetionSort() {
        Scanner scanner = new Scanner(System.in);
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = insertionSort.takeInput(scanner);
        insertionSort.solveProblem(arr);
    }

    private static void testInsetionSort2() {
        Scanner scanner = new Scanner(System.in);
        InsertionSort2 insertionSort2 = new InsertionSort2();
        int arr[] = insertionSort2.takeInput(scanner);
        insertionSort2.sort(arr);
    }

}
