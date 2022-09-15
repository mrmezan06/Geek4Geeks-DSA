package Pattern7;
// Link:

// https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7

class Solution {

    void printTriangle(int n) {
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space--;
            star += 2;
            System.out.println();
        }
    }
}

public class Pattern7 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}