package Decision_Making;

// https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%5B%5D=Java&category%5B%5D=Java&difficulty%5B%5D=-2&page=1&query=category%5B%5DJavadifficulty%5B%5D-2page1category%5B%5DJava

class Solution {
    static String compareNM(int n, int m) {
        if (n > m) {
            return "greater";
        } else if (n < m) {
            return "lesser";
        } else {
            return "equal";
        }
    }
}

public class Decision_Making {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 4;
        int m = 8;
        System.out.println(obj.compareNM(n, m));
    }
}
