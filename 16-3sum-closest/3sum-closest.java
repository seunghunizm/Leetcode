class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) { // iterate over array and create the two painters
            int head = i + 1;
            int tail = nums.length - 1;
            
            while (head < tail) {
                int sum  = nums[i] + nums[head] + nums[tail]; // calc the sum of the three numbers
                
                if (Math.abs(target - sum) < Math.abs(diff)) { // abs is absolute value and we check if the diff between sum and target is less than the current saved sum
                    diff = target - sum; // update if so
                }
                
                if (sum > target) {
                    tail--; // if sum is greater than target we pull the tail back
                }
                else {
                    head++; // if not push the head forward
                }
            }
        }
        return (target-diff);
    }
}