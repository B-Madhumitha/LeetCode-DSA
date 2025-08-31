class Solution {
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static int fDigit(int x){
        while(x>=10) x /= 10;
        return x;
    }
    static int lDigit(int x){
        return x%10;
    }
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int a = fDigit(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int b = lDigit(nums[j]);
                if(gcd(a,b)==1) count++;
            }
        }
        return count;
    }
}