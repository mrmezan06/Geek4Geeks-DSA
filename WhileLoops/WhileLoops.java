package WhileLoops;

// https://practice.geeksforgeeks.org/problems/while-loop-printtable-java/1

class Geeks {
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print(n * multiplier--);
            System.out.print(" ");
        }
        System.out.println();
    }

}

public class WhileLoops {
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        int n = 2;
        obj.printTable(n);
    }
}
