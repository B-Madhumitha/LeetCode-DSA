class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int parr[] = new int[n];
        int sarr[] = new int[n];
        parr[0] = nums[0];
        sarr[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            parr[i] = parr[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--){
            sarr[i] = sarr[i+1]*nums[i];
        }
        nums[0] = sarr[1];
        nums[n-1] = parr[n-2];
        for(int i=1;i<n-1;i++){
            nums[i] = parr[i-1]*sarr[i+1];
        }
        return nums;
    }
}