package Fibonnaci;

class Solution {
    public static int fibSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibSum(n - 1) + fibSum(n - 2);
    }

    // https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-first-n-fibonacci-numbers
    // Problems: base case: arr[0] = 1, arr[1] = 1
    public static long[] fibonacciNumbers(int N) {
        long[] arr = new long[N];
        if (N <= 1) {
            arr[0] = 1;
        } else {
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < N; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        return arr;
    }
}

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Solution.fibSum(n));
        long[] arr = Solution.fibonacciNumbers(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
