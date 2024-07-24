class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry; // start off the sum with the val of carry
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // converts to ascii and then adds the value to sum
                i--; // iterate back
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // converts to ascii and then adds the value to sum
                j--; // iterate back
            }
            result.append(sum % 2); // makes sure to retun 1 or 0 only
            carry = sum / 2; // if the sum can be divided by 2 meaning 2 or more then we update the carry
        }

        if (carry != 0) { // if carry doesn't end with a 0 then we append adding a new value of 1 
            result.append(carry);
        }

        return result.reverse().toString(); // return it
    }
}
