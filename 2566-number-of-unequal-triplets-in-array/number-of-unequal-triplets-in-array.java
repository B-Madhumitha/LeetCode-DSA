class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int a=nums[i], b=nums[j], c=nums[k];
                    if(a!=b && b!=c && c!=a) count++;
                }
            }
        }
        return count;
    }
}