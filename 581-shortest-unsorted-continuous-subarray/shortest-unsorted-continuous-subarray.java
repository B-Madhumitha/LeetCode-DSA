class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = nums[0], min = nums[nums.length-1];
        int li = -1, ri = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max) ri = i;
            else max = nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>min) li = i;
            else min = nums[i];
        }
        return (ri==-1)?0:ri-li+1;
    }
}