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

// Reverse print
class Solution1 {
    public void printNos(int N) {
        if (N < 1) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }
}

// Driver Code Starts
class PrintRecursion {
    public static void main(String[] args) {
        Solution ob = new Solution();
        Solution1 ob1 = new Solution1();
        int n = 15;
        ob.printNos(n);
        System.out.println();
        ob1.printNos(n);
    }
}
