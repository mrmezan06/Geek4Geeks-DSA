package Pattern15;

// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285196/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_15

class Solution {

    void printTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

public class Pattern15 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
