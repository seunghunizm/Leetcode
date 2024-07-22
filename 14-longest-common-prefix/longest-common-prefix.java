class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // sort the string strs
        String s1 = strs[0]; // put first element of the shortest string to s1
        String s2 = strs[strs.length-1]; // put the last element of the longest string to s2
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){ // while idx is less than length of s1 and s2
            if(s1.charAt(idx) == s2.charAt(idx)){ // check if char of each idx is equal
                idx++;
            } else {
                break; // if not equal break out the loop
            }
        }
        return s1.substring(0, idx); // return the lcp
    }
}