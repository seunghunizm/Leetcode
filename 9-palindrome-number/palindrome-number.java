class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        long reversed = 0;
        long temp = x;

        while (temp != 0){
            int number = (int) (temp%10);
            reversed = reversed * 10 + number;
            temp /= 10;
        }
        return(reversed == x);
    }
}