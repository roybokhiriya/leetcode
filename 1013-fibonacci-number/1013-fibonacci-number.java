import java.util.Scanner;

public class Solution {

    // Recursive method to calculate Fibonacci number
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of terms to print

        Solution obj = new Solution(); // Create object to call non-static method

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(obj.fib(i) + " ");
        }
    }
}
