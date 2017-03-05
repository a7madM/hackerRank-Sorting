package sorting;

import java.util.Scanner;

/**
 * Created by a7medM on 5/15/2016.
 */

// problem on HackerRank: https://www.hackerrank.com/challenges/tutorial-intro
public class TutorialIntro {
    public TutorialIntro() {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            arr[i] = number;
        }

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index);
            return;
        }
        System.out.println("Not Found");
    }
}
