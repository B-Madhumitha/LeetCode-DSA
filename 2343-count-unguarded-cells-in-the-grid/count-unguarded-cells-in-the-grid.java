class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for(int[] arr : guards){
            grid[arr[0]][arr[1]] = 1;
        }
        for(int[] arr:walls){
            grid[arr[0]][arr[1]] = 2;
        }
        for(int[] arr:guards){
            int r = arr[0];
            int c = arr[1];
            for(int i=r-1;i>=0;i--){
                if(grid[i][c]==1||grid[i][c]==2) break;
                if(grid[i][c]==0) grid[i][c]=3;
            }
            for(int i=r+1;i<m;i++){
                if(grid[i][c]==1||grid[i][c]==2) break;
                if(grid[i][c]==0) grid[i][c]=3;
            }
            for(int i=c-1;i>=0;i--){
                if(grid[r][i]==1||grid[r][i]==2) break;
                if(grid[r][i]==0) grid[r][i]=3;
            }
            for(int i=c+1;i<n;i++){
                if(grid[r][i]==1||grid[r][i]==2) break;
                if(grid[r][i]==0) grid[r][i]=3;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) count++;
            }
        }
        return count;
    }
}