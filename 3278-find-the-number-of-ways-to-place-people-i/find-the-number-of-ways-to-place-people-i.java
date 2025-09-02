class Solution {
    public int numberOfPairs(int[][] points) {
        int ans = 0;
        for(int i=0;i<points.length;i++){
            int ax = points[i][0];
            int ay = points[i][1];
            for(int j=0;j<points.length;j++){
                if(i==j) continue;
                int bx = points[j][0];
                int by = points[j][1];
                if(ax<=bx && ay>=by && (ax<bx || ay>by)){
                    boolean bool = true;
                    for(int k=0;k<points.length;k++){
                        if(k==i || k==j) continue;
                        int cx = points[k][0];
                        int cy = points[k][1];
                        if(cx>=ax && cx<=bx && cy>=by && cy<=ay){
                            bool = false;
                            break;
                        }
                    }
                    if(bool) ans++;
                }
            }
        }
        return ans;
    }
}