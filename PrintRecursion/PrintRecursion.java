package PrintRecursion;

// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

class Solution {
    public void printNos(int N) {
        if (N < 1) {
            return;
        }
        printNos(N - 1);
        System.out.print(N + " ");
    }
}

// Driver Code Starts
class PrintRecursion {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int n = 15;
        ob.printNos(n);
    }
}
