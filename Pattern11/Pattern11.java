package Pattern11;
// https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11

class Solution {

    void printTriangle(int n) {
        int c = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(c + " ");

                c = 1 - c;

            }

            c = i % 2;

            System.out.println();

        }
    }
}

public class Pattern11 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}