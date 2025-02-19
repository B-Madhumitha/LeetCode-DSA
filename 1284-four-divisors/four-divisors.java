class Solution {
    public static int fourDiv(int n){
        int count=0,sum=0;;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int pp = n/i;count++;
                sum += i;
                if(i!=pp){
                    count++;
                    sum += pp;
                }
                if(count>4) return 0;
            }
        }
        if(count==4) return sum;
        else return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum += fourDiv(num); 
        }
        return sum;
    }
}