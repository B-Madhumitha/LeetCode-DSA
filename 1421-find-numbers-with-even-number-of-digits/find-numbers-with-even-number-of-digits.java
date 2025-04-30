class Solution {
    public static boolean isEven(int n){
        int count=0;
        while(n!=0){;
            n=n/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums){
        int count=0;
        for(int i:nums){
            if(isEven(i)){
                count++;
            }
        }
        return count;
    }
}