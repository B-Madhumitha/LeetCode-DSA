class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr,'a');
        k = k-n;
        while(n>0 && k>0){
            int min = Math.min(25,k);
            arr[--n] = (char)(min+'a');
            k -=  min;
        }
        return String.valueOf(arr);
    }
}