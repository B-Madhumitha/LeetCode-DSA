class Solution{
    private boolean isIncreasing(List<Integer> nums,int s,int e) {
        for(int i=s;i<e;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(nums.size()<2*k){
            return false;
        }
        for(int i=0;i<=nums.size()-2*k;i++){
            if(isIncreasing(nums,i,i+k-1) && isIncreasing(nums,i+k,i+2*k-1)){
                return true;
            }
        }
        return false;
    }
}