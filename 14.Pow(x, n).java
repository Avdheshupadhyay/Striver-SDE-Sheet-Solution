class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        double ans = 1;
        long N = Math.abs((long)n);

        while (N > 0) {
            if (N % 2 != 0) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }

        return n > 0 ? ans : 1 / ans;
    }
}