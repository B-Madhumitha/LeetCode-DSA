class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += reward2[i];
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = reward1[i]-reward2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            sum += arr[n-i-1];
        }
        return sum;
    }
}