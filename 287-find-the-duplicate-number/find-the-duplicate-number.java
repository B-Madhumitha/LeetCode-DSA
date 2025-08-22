class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans = -1,low = 0,high = nums.length-1;
        while(low<=high){
            int count = 0;
            int mid = low+(high-low)/2;
            for(int n:nums){
                if(n<=mid) count++;
            }
            if(count>mid){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}