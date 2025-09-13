package Recursion;

public class Fibonacchi {

    static int fibonacchiRec(int n) {
        if (n <= 1)
            return n;
        return fibonacchiRec(n - 1) + fibonacchiRec(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacchiRec(i) + " ");
        }
    }
}
