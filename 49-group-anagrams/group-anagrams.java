class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if (strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        for (String anagram : strs) {
            char[] characters = anagram.toCharArray();
            Arrays.sort(characters);
            String key = String.valueOf(characters);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(anagram);
        }
        return new ArrayList<>(map.values());
    }
}