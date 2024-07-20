public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) { // if length is one or less just print it out
            return s;
        }

        int maxLen = 1; // initial val
        String maxStr = s.substring(0, 1);
        s = "#" + s.replaceAll("", "#") + "#"; // convert spaces to #
        int[] dp = new int[s.length()];
        int center = 0;
        int right = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < right) { // check if within right bound
                dp[i] = Math.min(right - i, dp[2 * center - i]); // mirrored position
            }

            while (i - dp[i] - 1 >= 0 && i + dp[i] + 1 < s.length() && s.charAt(i - dp[i] - 1) == s.charAt(i + dp[i] + 1)) {
                dp[i]++; // expand around center
            }

            if (i + dp[i] > right) { // if beyond right bound update center and right
                center = i; 
                right = i + dp[i];
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i]; // if it is longer than the longest update it
                maxStr = s.substring(i - dp[i], i + dp[i] + 1).replaceAll("#", ""); // convert back the spaces in
            }
        }

        return maxStr;
    }
}