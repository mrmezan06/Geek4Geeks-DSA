package Pattern14;

// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662284916/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_14

class Solution {

    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

public class Pattern14 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
