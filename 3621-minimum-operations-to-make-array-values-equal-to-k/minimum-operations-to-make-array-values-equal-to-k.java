class Solution {
    public int minOperations(int[] nums, int k) {
        int minVal=Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        if(minVal<k){
            return -1;
        }
        int op=0;
        while(true){
            int maxVal=Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
            if(maxVal==k) break;
            int h=k;
            for(int n:nums){
                if(n<maxVal && n>h){
                    h=n;
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]>h){
                    nums[i]=h;
                }
            }
            op++;
        }
        return op;
    }
}