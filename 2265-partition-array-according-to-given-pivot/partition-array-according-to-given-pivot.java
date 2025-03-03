class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int []arr = new int[nums.length];
        int l=0,r=nums.length-1;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]<pivot){
                arr[l] = nums[i];
                l++;
            }
            if(nums[j]>pivot){
                arr[r] = nums[j];
                r--;
            }
        }
        while(l<=r){
            arr[l] = pivot;
            l++;
        }
        return arr;   
    }
}