package Palindrome;

// https://practice.geeksforgeeks.org/problems/palindrome0746/1

class Solution {
    public String isPalindrome(int n) {
        String s = Integer.toString(n);
        String reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 12231;
        System.out.println(obj.isPalindrome(n));
    }
}