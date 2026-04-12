class Solution {
    private static int countBinary(int n){
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(char c:binary.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i=1;i<=n;i++){
            arr[i] = countBinary(i);
        }
        return arr;
    }
}