package Fibonnaci;

import java.util.ArrayList;

class Solution {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static ArrayList<Integer> fibonacciNumbers(int N) {
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        while (fib(c) <= N) {
            arr.add(fib(c));
            c++;
        }
        return arr;
    }
}

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Solution.fib(n));
        System.out.println(Solution.fibonacciNumbers(n));
    }
}
