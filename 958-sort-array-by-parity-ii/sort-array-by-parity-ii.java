class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int []ans = new int[nums.length];
        int ec=0,oc=1;
        for(int n:nums){
            if(n%2==0){
                ans[ec]=n;
                ec += 2;
            }
            else{
                ans[oc]=n;
                oc += 2;
            }
        }
        return ans;
    }
}