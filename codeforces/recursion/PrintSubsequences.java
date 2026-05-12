package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubsequences {
    public static void printAllSubsequences(int index, int[] arr, List<Integer> ds, int n) {
        // base case
        if (index == n) {
            System.out.println(ds);
            return;
        }

        // pick element
        ds.add(arr[index]);
        printAllSubsequences(index + 1, arr, ds, n);

        // backtrack
        ds.remove(ds.size() - 1);

        // not pick
        printAllSubsequences(index + 1, arr, ds, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Add elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("--------------------------");

        // int[] arr = { 3, 1, 2 };
        // int n = arr.length;

        List<Integer> ds = new ArrayList<>();

        printAllSubsequences(0, arr, ds, n);
        sc.close();
    }
}
