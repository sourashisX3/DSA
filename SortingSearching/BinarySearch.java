package SortingSearching;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        if (n == 0)
            return -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    static int binaraySearchRecursive(int[] arr, int target, int low, int high) {
        int n = arr.length;
        if (n == 0)
            return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                return binaraySearchRecursive(arr, target, mid + 1, high);
            else
                return binaraySearchRecursive(arr, target, low, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 10, 12, 14 };
        int target = 1;
        int res = binarySearch(arr, target);
        int recursive = binaraySearchRecursive(arr, target, 0, arr.length - 1);
        System.err.println(res);
        System.out.println(recursive);

    }
}
