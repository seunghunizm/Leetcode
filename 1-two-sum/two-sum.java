class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>(); // create a numMap hash map
        int n = nums.length; // n is the length of nums

        for (int i = 0; i < n; i++) { // for loop for the lenth of the n(length of array)
            numMap.put(nums[i], i); // build/input the hash map
        }

        for (int i = 0; i < n; i++) { //for loop to compare
            int complement = target - nums[i]; // complement is the target minux the current number
            if (numMap.containsKey(complement) && numMap.get(complement) != i) { // check if the map contains that complement and the get complement isn't pointing to the current numbe
                return new int[]{i, numMap.get(complement)}; // return that current integer and that complement's index 
            }
        }

        return new int[]{};
    }
}
