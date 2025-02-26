class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,ai=1,ad=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;dec=1;
                ai = Math.max(ai,inc);
            }
            else if(nums[i]<nums[i-1]){
                dec++;inc=1;
                ad = Math.max(ad,dec);
            }
            else{
                inc=1;dec=1;
            }
        }
        return Math.max(ai,ad);
    }
}