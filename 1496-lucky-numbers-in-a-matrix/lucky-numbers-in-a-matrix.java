class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> row  = new ArrayList<>();
        List<Integer> col  = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        for(int i=0;i<n;i++){
            int r = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                r = Math.min(r,matrix[i][j]);
            }
            row.add(r);
        }
        for(int i=0;i<m;i++){
            int c = Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                c = Math.max(c,matrix[j][i]);
            }
            col.add(c);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ans = matrix[i][j];
                if(ans==row.get(i) && ans==col.get(j)) res.add(ans);
            }
        }
        return res;
    }
}