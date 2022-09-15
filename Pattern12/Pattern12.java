package Pattern12;

// https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

class Solution {

    void printTriangle(int n) {
        int sp = (n - 1) * 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            sp -= 2;
            System.out.println();
        }
    }
}

public class Pattern12 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}