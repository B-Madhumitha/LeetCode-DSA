class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0, sum = 0, res = 0;
        Arrays.sort(capacity);
        for(int n:apple){
            sum += n;
        }
        for(int i=capacity.length-1;i>=0;i--){
            res += capacity[i];
            count++;
            if(res>=sum) return count;
        }
        return count;
    }
}