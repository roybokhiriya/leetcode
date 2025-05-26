class Solution {
    public double myPow(double x, int n) {
        long N = n;  
        return power(x, N);
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double half = power(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return x * half * half;
    }

    public static void main(String[] args) {
        Solution sol = new Solution(); 
        System.out.println(sol.myPow(2.00000, 10));  
        System.out.println(sol.myPow(2.10000, 3));   
        System.out.println(sol.myPow(2.00000, -2));  
        System.out.println(sol.myPow(2.00000, Integer.MIN_VALUE));  
    }
}
