class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>(); // create a hashmap to input the roman numerals with its respective value
        m.put('I', 1); // I -> 1
        m.put('V', 5); // V -> 5
        m.put('X', 10); // X -> 10
        m.put('L', 50); // L -> 50
        m.put('C', 100); // C -> 100
        m.put('D', 500); // D -> 500
        m.put('M', 1000); // M -> 1000

        int ans = 0;

        for (int i = 0; i < s.length(); i++){ // for loop for the length of string S
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) { // compare if I is smaller than the next roman 
                ans -= m.get(s.charAt(i)); // if smaller subtract
            } else {
                ans += m.get(s.charAt(i)); // if larger or equal add it
            }
        }
        return ans;
    }
}
