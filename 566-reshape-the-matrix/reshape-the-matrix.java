class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n1 = mat.length, n2 = mat[0].length;
        int[][] arr = new int[r][c];
        if((n1*n2)!=(r*c)) return mat;
        int op_r = 0, op_c = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[op_r][op_c] = mat[i][j];
                op_c++;
                if(op_c==c){
                    op_c = 0;
                    op_r++;
                }
            }
        }
        return arr;
    }
}