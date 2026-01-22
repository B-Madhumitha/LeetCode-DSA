class Solution {
    public static boolean isSorted(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int ans = 0;
        while(!isSorted(nums)){
            int minSum = Integer.MAX_VALUE, idx = -1;
            for(int i=0;i<nums.length-1;i++){
                int sum = nums[i]+nums[i+1];
                if(sum < minSum){
                    minSum = sum;
                    idx = i;
                }
            }
            int []arr = new int[nums.length-1];
            int newidx = 0;
            for(int i=0;i<nums.length;i++){
                if(i==idx){
                    arr[newidx++] = nums[i]+nums[i+1];
                    i++;
                }
                else{
                    arr[newidx++] = nums[i];
                }
            }
            nums = arr;
            ans++;
        }
        return ans;
    }
}