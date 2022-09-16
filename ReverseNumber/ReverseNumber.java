package ReverseNumber;

// https://takeuforward.org/c-programs/reverse-a-number-in-c/
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

    // https://takeuforward.org/data-structure/count-digits-in-a-number/
    // Count Digit
    public static int countDigit(int N) {
        int count = 0;
        while (N > 0) {
            N = N / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int N = 12345;
        System.out.println(obj.reverseNumber(N));

        // Count Digit
        System.out.println(countDigit(N));
    }
}
