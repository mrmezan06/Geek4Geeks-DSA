package FindFactorial;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n

class Solution {
    public static ArrayList<Long> factorialNumbers(long N) {
        ArrayList<Long> arr = new ArrayList<>();

        long fcs = 1;
        int c = 1;

        while (N >= fcs) {
            fcs = fcs * c;
            if (fcs <= N) {
                arr.add(fcs);
            }

            c++;
        }
        return arr;
    }
}

// Driver Code Starts
class FindFactorial {
    public static void main(String[] args) {
        long N = 100;
        System.out.println(Solution.factorialNumbers(N));
    }
}