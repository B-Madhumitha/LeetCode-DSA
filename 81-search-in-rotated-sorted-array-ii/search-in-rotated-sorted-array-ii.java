class Solution {
    static boolean binSearch(int[] arr, int low, int high, int x){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                return true;
            }
            else if(arr[mid]<x) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        boolean ans = binSearch(nums,0,nums.length-1,target);
        return ans;
    }
}