class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int oc=0,ec=1,ans=0,sum=0;
        for(int n:arr){
            sum += n;
            if(sum%2==1){
                ans = (ans+ec)%MOD;
                oc++;
            }
            else{
                ans = (ans+oc)%MOD;
                ec++;
            }
        }
        return ans;
    }
}