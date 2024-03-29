package com.rajul;

public class FindMinimumInASortedRotatedArrayPIVOT {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int ans = findPivot(nums);
        System.out.println(ans);
    }
    static int findPivot(int[] nums) {
        // Minimum element is called the pivot.
        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length-1;

        if (nums[right] >= nums[0]){
            return nums[0];
        }

        while (left <= right) {
            int mid = left + (right-left) / 2;

            if (nums[mid] > nums[mid+1]) return nums[mid+1];

            if (nums[mid] < nums[mid-1]) return nums[mid];

            if (nums[left] <= nums[mid]) left = mid + 1;

            else if (nums[mid] <= nums[right]) right = mid - 1;
        }
        return -1;
    }
}
