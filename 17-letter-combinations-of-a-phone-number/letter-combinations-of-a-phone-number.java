class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){ // if empty output empty
            return Collections.emptyList();
        }
        String[] mapping = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // map the strings
        List<String> output = new ArrayList<>();
        backtrack("", digits, mapping, output); // backtracking searches through all possible outcomes
        return output;
    }

    private void backtrack(String combined, String nextDigit, String[] mapping, List<String> output) { // generate all possible combinations
        if (nextDigit.isEmpty()) { // if no more digits then combinations have been formed
            output.add(combined); // output it
        } else {
            String characters = mapping[nextDigit.charAt(0) - '2']; // map digit accordingly
            for (char character : characters.toCharArray()) { // 
                backtrack(combined + character, nextDigit.substring(1), mapping, output); // concantinates the character to combined and does it recursively for every digit
            }
        }
    }
}