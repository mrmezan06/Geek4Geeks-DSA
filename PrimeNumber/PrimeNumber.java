package PrimeNumber;

class Solution {

    // https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
    public String isPrime(int N) {
        if (N == 1) {
            return "No";
        }
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                return "No";
            }
        }
        return "Yes";
    }

    public String isPrimeOptimized(int N) {
        if (N == 1) {
            return "No";
        }
        if (N == 2 || N == 3) {
            return "Yes";
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return "No";
        }
        for (int i = 5; i <= (int) Math.sqrt(N); i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return "No";
            }
        }
        return "Yes";
    }

}

// Driver code
public class PrimeNumber {
    public static void main(String[] args) {
        int N = 11;
        Solution s = new Solution();
        System.out.println(s.isPrime(N));
        System.out.println(s.isPrimeOptimized(N));
    }
}
