package MinJumps;

// https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution {
    /*
     * Given an array of N integers arr[] where each element represents the max
     * length of the jump that can be made forward from that element. Find the
     * minimum number of jumps to reach the end of the array (starting from the
     * first element). If an element is 0, then you cannot move through that
     * element.
     * 
     * Note: Return -1 if you can't reach the end of the array.
     */
    public int minJumps(int[] arr) {
        // Time Limit Exceeded. Time Complexity: O(n^2)
        int n = arr.length;
        int[] jumps = new int[n];
        jumps[0] = 0;
        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        // System.out.println(Integer.MAX_VALUE);
        return jumps[n - 1] >= Integer.MAX_VALUE ? -1 : jumps[n - 1];
    }

    // Optimized solution
    public int minJumpsOptimized(int[] arr) {
        // Time Complexity: O(n)
        int n = arr.length;
        if (arr[0] == 0 && n > 1)
            return -1;

        if (n == 1)
            return 0;

        int steps = arr[0];
        int maxReach = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;

            if (steps > 0) {
                maxReach = Math.max(maxReach, arr[i] + i);
                steps--;
            }
            if (steps == 0) {
                if (i >= maxReach)
                    return -1;
                jumps++;
                steps = maxReach - i;
            }
        }
        return -1;

    }

}

// Driver code
public class MinJumps {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int[] arr2 = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
        int[] arr3 = { 0, 1, 1, 1, 1 };
        Solution s = new Solution();
        System.out.println(s.minJumpsOptimized(arr1));
        System.out.println(s.minJumpsOptimized(arr2));
        System.out.println(s.minJumpsOptimized(arr3));
    }

}
