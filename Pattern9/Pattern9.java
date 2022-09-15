package Pattern9;

// https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9

class Solution {

    void printDiamond(int n) {
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            space--;
            star += 1;
            System.out.println();
        }
        space = 0;
        star = n;
        for (int i = 1; i <= n; i++) {
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            space++;
            star -= 1;
            System.out.println();
        }
    }
}

public class Pattern9 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printDiamond(n);
    }
}
