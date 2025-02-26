class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0,min=0,cmax=0,cmin=0;
        for(int n:nums){
            cmax = Math.max(n,cmax+n);
            max = Math.max(max,cmax);
            cmin = Math.min(n,cmin+n);
            min = Math.min(min,cmin);
        }
        return Math.max(max,Math.abs(min));
    }
}