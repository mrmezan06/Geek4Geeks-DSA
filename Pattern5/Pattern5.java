package Pattern5;
// Link:

// https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5

class Solution {

    void printTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
