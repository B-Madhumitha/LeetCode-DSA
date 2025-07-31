class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        for(int n:nums) sum += n;
        long sum1 = 0,sum2 = 0;
        int diff = Integer.MAX_VALUE, ans = 0;
        for(int i=0;i<nums.length;i++){
            sum1 += nums[i];
            long avg1 = sum1/(i+1);
            sum2 = sum - sum1;
            long avg2 = (i==nums.length-1)?0:(sum2/(nums.length-i-1));
            int dif = (int)Math.abs(avg1-avg2);
            if(dif<diff){
                diff = dif;
                ans = i;
            }
        }
        return ans;
    }
}