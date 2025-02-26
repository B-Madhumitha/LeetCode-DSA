class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lc=0,rc=0;
        for(int n:nums){
            if(n==1){
                lc++;
                rc = Math.max(lc,rc);
            }
            else lc=0;
        }
        return rc;
    }
}