class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int i=0, maxLen = 0, res = 0;
        for(int j=0;j<n;j++){
            while((res&nums[j])!=0){
                res ^= nums[i]; // removing the element as it's not satisfying the condition
                i++;
            }
            res |= nums[j]; // adding the element
            maxLen = Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}