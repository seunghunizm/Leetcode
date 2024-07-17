class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) { //this part checks if the number is not a negative and doesn't end with 0 cause a number cannot start with 0
            return false;
        }

        int reversed = 0; // initial value of 0
        int original = x; // original for comparison

        while (x > reversed) { //if x is odd it gives one more to reversed
            reversed = reversed * 10 + x % 10; // times it by 10 - push one digit - and add the remainder of x
            x /= 10; // divide it by 10 - pop one digit
        }

        return (x == reversed) || (x == reversed / 10); // checks if both halves are identical. In case of Odd the last digit of reversed is ignored aka the middle number
    }
}
