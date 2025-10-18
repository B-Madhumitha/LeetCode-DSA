class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for(int n:nums){
            int curr = Math.min(Math.max(n-k,prev+1),n+k);
            if(curr>prev){
                count++;
                prev = curr;
            }
        }
        return count;
    }
}