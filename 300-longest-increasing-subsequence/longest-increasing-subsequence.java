class Solution {
    public int lengthOfLIS(int[] nums) {
        int arr[] = new int[nums.length];
        int size = 0;
        for(int n:nums){
            int i=0,j=size;
            while(i!=j){
                int m = (i+j)/2;
                if(arr[m]<n) i=m+1;
                else j=m;
            }
            arr[i] = n;
            if(i==size) ++size;
        }
        return size;
    }
}