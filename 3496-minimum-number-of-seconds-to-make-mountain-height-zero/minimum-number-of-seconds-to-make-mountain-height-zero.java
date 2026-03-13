class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int max = 0;
        for(int i:workerTimes) max = Math.max(max,i);
        long l = 1;
        long h = ((long)max*mountainHeight*(mountainHeight+1))/2;
        long ans = 0;
        while(l<=h){
            long mid = (l+h)/2;
            long count = 0;
            for(int i:workerTimes){
                long w = mid/i;
                long k = (long)((-1.0+Math.sqrt(1+w*8))/2+(1e-7));
                count += k;
            }
            if(count>=mountainHeight){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
}