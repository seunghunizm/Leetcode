class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){ //checks if it's negative
            return false;
        }
        long reversed = 0; // initial reverse
        long temp = x; // temporary variable

        while (temp != 0){ // while temp doesn't equal 0
            int number = (int) (temp%10); // remainder aka last digit
            reversed = reversed * 10 + number; // push in the remainder
            temp /= 10; // pop out the last digit
        }
        return(reversed == x); // check if reversed is equal to x
    }
}
