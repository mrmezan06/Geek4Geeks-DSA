package ArmStrongNumber;

// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
class Solution {
    public String isArmstrong(int N) {
        int temp = N;
        int sum = 0;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int temp1 = N;
        for (int i = 0; i < count; i++) {
            int digit = N % 10;
            sum += Math.pow(digit, count);
            N /= 10;
        }
        if (sum == temp1) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

// Driver code
public class ArmStrongNumber {
    public static void main(String[] args) {
        int N = 153;
        Solution s = new Solution();
        System.out.println(s.isArmstrong(N));
    }
}