class Solution {
    public int specialArray(int[] nums) {
        for(int x=1;x<=nums.length;x++){
            int count=0;
            for(int n:nums){
                if(n>=x) count++;
            }
            if(x==count) return x;
        }
        return -1;
    }
}