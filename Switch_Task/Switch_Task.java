package Switch_Task;

import java.util.ArrayList;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        double area = 0;
        switch (choice) {
            case 1:

                double R = arr.get(0);
                area = Math.PI * R * R;
                break;
            case 2:
                double L = arr.get(0);
                double B = arr.get(1);
                area = L * B;
                break;
            default:
                break;
        }
        return area;
    }
}

public class Switch_Task {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int choice = 1;
        List<Double> arr = new ArrayList<>();
        arr.add(5.0);
        System.out.println(obj.switchCase(choice, arr));
    }
}
