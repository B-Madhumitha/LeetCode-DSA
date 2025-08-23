class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1) sum += nums[i];
            else break;
        }
        Arrays.sort(nums);
        for(int n:nums){
            if(n==sum) sum++;
        }
        return sum;
    }
}