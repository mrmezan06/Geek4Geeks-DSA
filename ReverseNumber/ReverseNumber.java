package ReverseNumber;

class Solution {
    public int reverseNumber(int N) {
        int s = 0;
        while (N > 0) {
            int d = N % 10;
            s = s * 10 + d;
            N = N / 10;
        }
        return s;
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int N = 12345;
        System.out.println(obj.reverseNumber(N));
    }
}
