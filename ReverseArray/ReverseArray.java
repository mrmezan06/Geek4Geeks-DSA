package ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        try ( // input how many elements you want to store in array
                Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t != 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                // input elements in array
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // Reverse array
                for (int i = 0; i < n / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[n - i - 1];
                    arr[n - i - 1] = temp;
                }
                // Print array
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                t--;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
