class Solution {
    public int longestSubarray(int[] nums) {
        int zcount = 0, k = 0, start = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zcount++;
            while(zcount>1){
                if(nums[start]==0) zcount--;
                start++;
            }
            k = Math.max(k,i-start);
        }
        return k;
    }
}