class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>(); // create new arraylist
        
        if (nums.length < 3) {
            return output; // if length is less that 3 just print empty
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) { // if current is greater than 0 break cuz if start is positive then no way it will be = to 0
                break;
            }
            
            if (i > 0 && nums[i] == nums[i - 1]) { 
                continue; // skip repeated ones
            }
            
            int front = i + 1, back = nums.length - 1;
            while (front < back) {
                int sum = nums[i] + nums[front] + nums[back]; // continue till they meet
                if (sum > 0) { // adjust pointer based on the sum
                    back--; // if sum is less than 0 back is decremented
                } else if (sum < 0) {
                    front++; // if greater than 0 increment front
                } else {
                    output.add(Arrays.asList(nums[i], nums[front], nums[back])); // the 3 are added
                    int lastFrontOccurrence = nums[front];
                    int lastBackOccurrence = nums[back];
                    
                    while (front < back && nums[front] == lastFrontOccurrence) {
                        front++; // skip through if it's the same as the last one
                    }
                    
                    while (front < back && nums[back] == lastBackOccurrence) {
                        back--; // skip if the same as the last one
                    }
                }
            }
        }
        return output;
    }
}