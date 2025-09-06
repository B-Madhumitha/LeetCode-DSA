class Solution {
    public int minStartValue(int[] nums) {
        int preArr = 0,min = Integer.MAX_VALUE;
        for(int n:nums){
            preArr += n;
            min = Math.min(min,preArr);
        }
        return (min<1)?Math.abs(min)+1:1;
    }
}