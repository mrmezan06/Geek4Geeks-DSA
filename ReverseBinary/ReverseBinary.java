package ReverseBinary;

// https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
class Solution1 {
    // 32 bit Long to Binary
    public Long reverseBinary(Long N) {
        String result = Long.toBinaryString(N | 0x100000000L).substring(1);
        // reverse the string
        String reverse = new StringBuffer(result).reverse().toString();
        // String to Long
        Long l = Long.parseLong(reverse, 2);
        return l;
    }
}

// https://leetcode.com/problems/reverse-integer/
class Solution2 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

public class ReverseBinary {
    public static void main(String[] args) {
        // GeeksForGeeks
        Solution1 obj = new Solution1();
        Long N = (long) 1;
        System.out.println(obj.reverseBinary(N));

        // LeetCode
        Solution2 obj2 = new Solution2();
        int x = -123;
        System.out.println(obj2.reverse(x));
    }
}