package dp;

import java.util.Arrays;

public class Fibonacchi {

    public static int fib(int n, boolean useMemoization) {

        if (useMemoization) {
            if (n <= 1)
                return n;
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            dp[1] = 1;
            return fibMemo(n, dp);
        } else {
            if (n <= 1)
                return n;
            return fibTab(n);
        }

    }

    private static int fibMemo(int n, int[] dp) {
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
    }

    private static int fibTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n, false));
    }
}
