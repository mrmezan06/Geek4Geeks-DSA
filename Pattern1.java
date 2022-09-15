// Link:
// https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1

class Solution {

    void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// { Driver Code Starts.
public class Pattern1 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 5;
        obj.printSquare(n);
    }
}