package Math;

public class PrimeNo {

    static boolean isPrime(int n) {
        boolean isPrimeNo = true;

        if (n <= 1) {
            isPrimeNo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrimeNo = false;
                    break;
                }
            }
        }
        return isPrimeNo;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isPrime(n));
    }
}
