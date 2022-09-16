package CountDigits;

// Link:
// https://practice.geeksforgeeks.org/problems/count-digits5716/1
class Solution {
    static int evenlyDivides(int N) {
        int s = N;
        int c = 0;
        while (s > 0) {
            int d = s % 10;
            if (d != 0 && N % d == 0) {
                c++;
            }
            s = s / 10;
        }
        return c;
    }
}

public class CountDigits {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int N = 22074;
        System.out.println(obj.evenlyDivides(N));
    }
}