class Solution {
    public int countElements(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int n:nums){
            if(n>min && n<max) count++;
        }
        return count;
    }
}