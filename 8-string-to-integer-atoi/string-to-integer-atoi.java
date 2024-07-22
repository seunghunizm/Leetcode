class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // remove whitespace
        if (s.isEmpty()) {
            return 0; // if empty just return 0
        }

        int ans = 0, i = 0;
        boolean neg = s.charAt(0) == '-'; // set negative and positive
        boolean pos = s.charAt(0) == '+';

        if (neg || pos) {
            i++; // if negative or positive up it
        }

        int maxDiv10 = Integer.MAX_VALUE / 10; // maximum value that can be handled

        while (i < s.length() && Character.isDigit(s.charAt(i))) { // while i is less than length and character is a digit
            int digit = s.charAt(i) - '0'; // convert to integer

            if (ans > maxDiv10 || (ans == maxDiv10 && digit > Integer.MAX_VALUE % 10)) { // check for overflow
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE; // return min val for neg and max val for pos
            }

            ans = ans * 10 + digit; // update the result by appending current digit
            i++; // process next character
        }

        return neg ? -ans : ans; // if neg was set true then return a neg ans if not return pos ans
    }
}
