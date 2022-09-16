package GCD;

// Eucledean algorithm || Recursive
class Solution1 {
    public int gcd(int A, int B) {
        if (A == 0) {
            return B;
        }
        return gcd(B % A, A);
    }
}

// Iterative
class Solution2 {
    public int gcd(int A, int B) {
        while (A != 0) {
            int temp = A;
            A = B % A;
            B = temp;
        }
        return B;
    }
}

// Looped Iterative
class Solution3 {
    public int gcd(int A, int B) {
        int ans = 1;
        for (int i = 1; i <= Math.min(A, B); i++) {
            if (A % i == 0 && B % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}

// Driver code
public class GCD {
    public static void main(String[] args) {
        int A = 10, B = 15;
        Solution1 s1 = new Solution1();
        Solution2 s2 = new Solution2();
        Solution3 s3 = new Solution3();

        System.out.println(s1.gcd(A, B));
        System.out.println(s2.gcd(A, B));
        System.out.println(s3.gcd(A, B));
    }
}
