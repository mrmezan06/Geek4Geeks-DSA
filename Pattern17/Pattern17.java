package Pattern17;

// https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

class Solution {

    void printTriangle(int n) {
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print((char) (j + 64));
                if (j == star) {
                    for (int k = star - 1; k > 0; k--) {
                        System.out.print((char) (k + 64));
                    }
                }

            }
            space--;
            star += 1;
            System.out.println();
        }
    }
}

public class Pattern17 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printTriangle(n);
    }
}
