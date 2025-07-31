class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int res[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int left = (i>0)?prefix[i-1]:0;
            int right = prefix[nums.length-1]-prefix[i];
            res[i] = nums[i]*i-left+right-nums[i]*(nums.length-i-1);
        }
        return res;
    }
}