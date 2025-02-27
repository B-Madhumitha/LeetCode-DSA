class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int []arr = new int[2];
        Set<Integer> set = new HashSet<>();
        int n = grid.length;
        int nn = n*n;
        int excsum = nn*(nn+1)/2;
        int acsum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int num = grid[i][j];
                if(!set.add(num)) arr[0] = num;
                acsum += num;
            }
        }
        arr[1] = excsum-acsum+arr[0];
        return arr;
    }
}