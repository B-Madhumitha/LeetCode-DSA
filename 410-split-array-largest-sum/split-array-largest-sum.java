class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int i:nums){
            low = Math.max(low,i);
            high += i;
        }
        while(low<high){
            int mid = low+(high-low)/2;
            int pieces = 1,sum = 0;
            for(int i:nums){
                if(sum+i>mid){
                    sum = i;
                    pieces++;
                }
                else{
                    sum += i;
                }
            }
            if(pieces>k) low = mid+1;
            else high = mid;
        }
        return high;
    }
}