class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int[] arr = matrix[i];
            int low = 0, high = arr.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr[mid]==target) return true;
                else if(arr[mid]<target) low = mid+1;
                else high=mid-1;
            }
        }
        return false;
    }
}