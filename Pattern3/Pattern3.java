package Pattern3;

// Link:
// https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3

class Solution {

    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
