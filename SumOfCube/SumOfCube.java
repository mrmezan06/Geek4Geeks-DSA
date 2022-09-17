package SumOfCube;

// Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.
// Solution: sum = {n*(n+1)/2}^2

class Solution {
    long sumOfSeries(long n) {
        return (n * (n + 1) / 2) * (n * (n + 1) / 2);
    }
}

// Driver Code Starts
class SumOfCube {

    public static void main(String[] args) {
        Solution ob = new Solution();
        // long n = 50000;
        long n = 5;
        System.out.println(ob.sumOfSeries(n));
    }
}