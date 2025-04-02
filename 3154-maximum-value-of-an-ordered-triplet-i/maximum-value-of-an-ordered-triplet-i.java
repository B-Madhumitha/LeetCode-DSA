class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length; long max=0;
        int []la = new int[n];
        int []ra = new int[n];
        for(int i=1;i<n;i++){
            la[i] = Math.max(la[i-1],nums[i-1]);
            ra[n-1-i] = Math.max(ra[n-i],nums[n-i]);
        }
        for(int j=1;j<n-1;j++){
            max = Math.max(max,(long)(la[j]-nums[j])*ra[j]);
        }
        return max;
    }
}