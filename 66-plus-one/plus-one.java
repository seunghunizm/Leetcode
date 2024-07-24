class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	        if (digits[i] == 9) { // if the digit is equal to 9 convert to 0
	            digits[i] = 0;
	        }
            else{
                digits[i]++; // if not add and return result
                return digits;
            }
        }
        digits = new int[digits.length + 1]; // if fails to return digit cause all are 9 then increase the length
        digits[0] = 1; // make the very first index 1
        return digits; // return it
    }
}