class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min1 = nums[0];
        int min2 = nums[1];
        int max1 = nums[n-1];
        int max2 = nums[n-2];
        int maxProd = (max1*max2);
        int minProd = (min1*min2);
        return Math.abs(minProd-maxProd);
    }
}