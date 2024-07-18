class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // mark all values
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; // mark roman numerals
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < val.length && num > 0; i++) { // for loop for when I is less than the length of the values and the num variable is greater than 0
            
            while (num >= val[i]) { // while given num isn't less than the val of index i 
                num -= val[i]; // we keep subtracting the val of index i to the num
                result.append(roman[i]); // get the result connected to roman of index i
            }
        }
        
        return result.toString(); // return the string
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(0)); // prints out the intended value as roman 
    }
}
