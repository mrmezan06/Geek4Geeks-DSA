package Pattern2;

// Link:
// https://practice.geeksforgeeks.org/problems/right-triangle/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_2
class Solution {

    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern2 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
