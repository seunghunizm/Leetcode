class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if (strs == null || strs.length == 0){ // if nothing just return it
            return new ArrayList<>(); // could shorten by using map.putIfAbsent(sortedWord, new ArrayList<>());
        }
        for (String anagram : strs) {
            char[] characters = anagram.toCharArray();
            Arrays.sort(characters); // we get each word sort the word then check it with the originally sorted word to see if it matches
            String key = String.valueOf(characters);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>()); // if it doesn't contain the key aka the original sorted word make new
            }
            map.get(key).add(anagram); // get the key and then add it
        }
        return new ArrayList<>(map.values());
    }
}
