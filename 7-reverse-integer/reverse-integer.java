class Solution {
    public int reverse(int x) { // must not use long due to constaint
        int reverse = 0;
        int temp;
        int maxDiv10 = Integer.MAX_VALUE / 10; // initialize first for speed
        int minDiv10 = Integer.MIN_VALUE / 10;

        while (x != 0) {
            temp = x % 10;
            if (reverse > maxDiv10 || (reverse == maxDiv10 && temp > 7) || // check to see if it is within the boundaries
                reverse < minDiv10 || (reverse == minDiv10 && temp < -8)) {
                return 0;
            }
            reverse = reverse * 10 + temp;
            x /= 10; // create the reverse
        }

        return reverse;
    }
}
