class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] larr = new int[n];
        int[] rarr = new int[n];
        larr[0] = 0; rarr[n-1] = 0;
        for(int i=1;i<n;i++){
            larr[i] = larr[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rarr[i] = rarr[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i] = Math.abs(larr[i]-rarr[i]);
        }
        return arr;
    }
}