package ReverseBinary;

class Solution {
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

public class ReverseBinary {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Long N = (long) 1;
        System.out.println(obj.reverseBinary(N));
    }
}