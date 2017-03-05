package main;

import sorting.InsertionSort;
import sorting.TutorialIntro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private void testInsetionSort() {
        Scanner scanner = new Scanner(System.in);
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = insertionSort.takeInput(scanner);
        insertionSort.solveProblem(arr);
    }
}
