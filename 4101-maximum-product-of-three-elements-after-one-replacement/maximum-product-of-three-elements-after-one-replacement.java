class Solution {
    public long maxProduct(int[] nums) {
        int max = 0, smax = 0;
        for(int i:nums){
            int num = Math.abs(i);
            if(num>max){
                smax = max;
                max = num;
            }
            else if(num<=max && num>=smax) smax = num;
        }
        return (long)smax*max*100000;
    }
}