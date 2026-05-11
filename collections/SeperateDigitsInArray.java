import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SeperateDigitsInArray {

    public static List<Integer> getListOfDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n != 0) {
            int lastDigit = n % 10;
            digits.add(lastDigit);
            n /= 10;
        }
        Collections.reverse(digits);
        return digits;
    }

    public static int[] seperateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> seperatedDigits = new ArrayList<>();
        int l = seperatedDigits.size();
        int[] arr = new int[l];

        for (int i = 0; i < n; i++) {
            List<Integer> listOfDigits = getListOfDigits(nums[i]);
            seperatedDigits.addAll(listOfDigits);
        }

        for (int i = 0; i < l; i++) {
            arr[i] = seperatedDigits.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = seperateDigits(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}