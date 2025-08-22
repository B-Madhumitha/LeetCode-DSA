class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int x = Math.abs(arr[i]-arr[j]);
                    int y = Math.abs(arr[j]-arr[k]);
                    int z = Math.abs(arr[i]-arr[k]);
                    if(x<=a && y<=b && z<=c) count++;
                }
            }
        }
        return count;
    }
}