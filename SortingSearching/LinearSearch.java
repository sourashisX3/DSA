package SortingSearching;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,10,1,0,3};
        int target = 0;
        int res = linearSearch(arr, target);
        System.out.println(res);
    }
}
