package Pattern18;

// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662286302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_18

class Solution {

    void printTriangle(int n) {
        for (int j = 1; j <= n; j++) {
            int end = n;
            for (int i = 1; i <= j; i++) {
                System.out.print((char) (end + 64) + " ");
                end--;
            }
            System.out.println();
        }
    }
}

public class Pattern18 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
