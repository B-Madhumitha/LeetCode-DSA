class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> eset = new HashSet<>();
            Set<Integer> oset = new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2!=0) oset.add(nums[j]);
                else eset.add(nums[j]);
                if(oset.size()==eset.size()) maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
}