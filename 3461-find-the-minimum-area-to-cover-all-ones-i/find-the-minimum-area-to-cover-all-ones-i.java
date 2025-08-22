class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int w = n, x = 0, y = m, z = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    w = Math.min(w,i);
                    x = Math.max(x,i);
                    y = Math.min(y,j);
                    z = Math.max(z,j);
                }
            }
        }
        return (x-w+1)*(z-y+1);
    }
}