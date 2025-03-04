class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int i=0,j=nums.length-1;
        while(i<j){
            long l = nums[i],r=nums[j];
            String s = Long.toString(l)+Long.toString(r);
            long sum = Long.parseLong(s);
            ans += sum;
            i++;j--;
        }
        if(i==j) ans += nums[i];
        return ans;
    }
}