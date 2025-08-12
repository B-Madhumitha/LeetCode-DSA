class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int n1 = original.length;
        int [][] arr = new int[m][n];
        if(m*n != n1) return new int[0][0];
        int k = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = original[k];
                k++;
            }
        }
        return arr;
    }
}