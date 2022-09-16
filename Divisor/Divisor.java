package Divisor;

class Solution {
    // Print all divisors of a number
    public void printDivisors(int N) {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Optimized solution
    public void printDivisorsOptimized(int N) {
        for (int i = 1; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
                if (i != N / i) {
                    System.out.print(N / i + " ");
                }
            }
        }
    }

    // Sum of all divisors of a number
    public int sumOfDivisor(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
    public long sumOfDivisors(int N) {
        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += (N / i) * i;
        }
        return sum;
    }
}

// Driver code
public class Divisor {
    public static void main(String[] args) {
        int N = 36;
        Solution s = new Solution();
        s.printDivisors(N);
        System.out.println();
        s.printDivisorsOptimized(N);
        System.out.println();
        System.out.println(s.sumOfDivisor(N));
        // GeeksForGeeks
        System.out.println(s.sumOfDivisors(4));

    }
}
