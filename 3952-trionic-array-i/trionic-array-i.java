class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i=1;
        while(i<n && nums[i-1]<nums[i]) i++;
        int p=i-1;
        while(i<n && nums[i-1]>nums[i]) i++;
        int q=i-1;
        while(i<n && nums[i-1]<nums[i]) i++;
        int m=i-1;
        return (p!=0) && (q!=0) && (m==n-1 && m!=q);
    }
}