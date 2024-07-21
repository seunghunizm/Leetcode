class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int temp;
        int maxDiv10 = Integer.MAX_VALUE / 10;
        int minDiv10 = Integer.MIN_VALUE / 10;

        while (x != 0) {
            temp = x % 10;
            if (reverse > maxDiv10 || (reverse == maxDiv10 && temp > 7) ||
                reverse < minDiv10 || (reverse == minDiv10 && temp < -8)) {
                return 0;
            }
            reverse = reverse * 10 + temp;
            x /= 10;
        }

        return reverse;
    }
}
