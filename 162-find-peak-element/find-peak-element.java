class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length,ans=0;
        if(n==1) return 0;
        else{
            for(int i=0;i<n-1;i++){
                if(nums[i]<nums[i+1]){
                    ans = Math.max(ans,i+1);
                }
            }
        }
        return ans;
    }
}