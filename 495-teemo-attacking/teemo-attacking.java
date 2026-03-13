class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        for(int i=0;i<timeSeries.length-1;i++){
            int mid = timeSeries[i+1]-timeSeries[i];
            time += Math.min(duration,mid);
        }
        return time+duration;
    }
}