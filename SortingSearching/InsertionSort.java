package SortingSearching;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;
        int key, j;

        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 25, 0, 7, -1 };
        insertionSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
