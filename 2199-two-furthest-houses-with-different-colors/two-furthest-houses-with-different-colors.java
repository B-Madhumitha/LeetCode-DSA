class Solution {
    public int maxDistance(int[] colors) {
        int max = 0,n = colors.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(colors[i]!=colors[j]){
                    int diff = Math.abs(i-j);
                    max = Math.max(max,diff);
                }
                else continue;
            }
        }
        return max;
    }
}