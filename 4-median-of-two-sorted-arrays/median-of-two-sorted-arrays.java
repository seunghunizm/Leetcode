import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length; //input the lengths
        int m = nums2.length;

        int[] merged = new int[n + m]; // merge it to an array
        int k = 0;
        for (int i = 0; i < n; i++) { // array 1
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < m; i++) { // array 2
            merged[k++] = nums2[i];
        }

        Arrays.sort(merged); // sort it

        int total = merged.length; // get total num of elements

        if (total % 2 == 1) {
            return (double) merged[total / 2]; // if odd get the middle val
        } else {
            int middle1 = merged[total / 2 - 1]; // if even get middle two element
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0; // divide it to two
        }
    }
}