package SumorProduct;

// Link:
// https://www.codingninjas.com/codestudio/problems/sum-or-product_920478?leftPanelTab=0

class Solution {
    public long SumOrProduct(int n, int q) {
        final int M = 1000000007;
        if (q == 1) {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = (sum + i);
            }
            return (sum);

        } else {
            long pdt = 1;
            for (int i = 1; i <= n; i++) {
                pdt = (pdt * i) % M;
            }
            return (pdt);
        }
    }
}

// Driver Code Starts
class SumOrProduct {
    public static void main(String[] args) {
        Solution ob = new Solution();
        int n = 15;
        int q = 2;
        System.out.println(ob.SumOrProduct(n, q));
    }
}