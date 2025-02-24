class Solution {
    public int arraySign(int[] nums) {
        int i=0;
        for(int n:nums){
            if(n==0) return 0;
            if(n<0) i++;
        }
        return (i%2==0)?1:-1;
    }
}