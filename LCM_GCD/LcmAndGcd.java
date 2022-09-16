package LCM_GCD;

// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
class Solution {
    public Long[] lcmAndGcd(Long A, Long B) {
        Long X = A, Y = B;
        while (A != 0) {
            Long temp = A;
            A = B % A;
            B = temp;
        }

        Long gcd = B;

        Long lcm = (X * Y) / gcd;
        return new Long[] { lcm, gcd };
    }
}

// Driver code
public class LcmAndGcd {
    public static void main(String[] args) {
        Long A = 5L, B = 10L;
        Solution s = new Solution();
        Long[] ans = s.lcmAndGcd(A, B);
        System.out.println(ans[0] + " " + ans[1]);
    }
}