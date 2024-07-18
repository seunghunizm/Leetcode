class Solution {
    public int romanToInt(String s) {
    
        int answer = 0, number = 0, prev = 0; // initial value

        for (int j = s.length() - 1; j >= 0; j--) { //starting is the last val and we go backwards while j is greater or equal to 0
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) { // if current number is less than the previous number then we subtract
                answer -= number;
            }
            else {
                answer += number; // if greater then we add
            }
            prev = number; // number becomes the prev so we can move on
        }
        return answer;
    }
}
