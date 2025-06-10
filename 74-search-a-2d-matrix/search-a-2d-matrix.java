class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length;
        int j = matrix[0].length;
        if(i==0) return false;
        int low=0,high=i*j-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int x = matrix[mid/j][mid%j];
            if(x==target) return true;
            else if(x<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}