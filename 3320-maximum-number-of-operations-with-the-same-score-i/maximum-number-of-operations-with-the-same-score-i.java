class Solution {
    public int maxOperations(int[] nums) {
        int prev = nums[0]+nums[1];
        int count = 1;
        for(int i=2;i<nums.length-1;i+=2){
            if(nums[i]+nums[i+1]==prev) count++;
            else break;
        }   
        return count;
    }
}