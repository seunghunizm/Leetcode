class Solution {
    public String convert(String s, int numRows) {
       if (numRows == 1 || numRows >= s.length()) {
            return s; // if numRows is 1 it's just string s
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) { // depending on the numRows create that many arrays
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c); // add character
            if (idx == 0) { // if index is 0 
                d = 1; // go forwards
            } else if (idx == numRows - 1) { // if index reaches maximum numRows
                d = -1; // go backward
            }
            idx += d; // update index with direction
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c); // create the output
            }
        }

        return result.toString();        
    }
}