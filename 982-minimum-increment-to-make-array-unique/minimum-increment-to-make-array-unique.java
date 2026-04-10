class Solution {
    public int minIncrementForUnique(int[] nums) {
        int minN = 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int sum = nums[i-1]+1-nums[i];
                minN += sum;
                nums[i] = nums[i-1]+1;
            }
        }
        return minN;
    }
}