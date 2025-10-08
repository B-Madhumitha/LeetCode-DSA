class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE,ans=0;
        for(int x:nums){
            max = Math.max(max,x);
        }
        while(k>0){
            ans += max;
            max++;
            k--;
        }
        return ans;
    }
}