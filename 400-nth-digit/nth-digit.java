class Solution {
    public int findNthDigit(int n) {
        long len = 1, count = 9, start = 1;
        while(n>len*count){
            n -= len*count;
            len++;
            count *= 10;
            start *= 10;
        }
        long idx = (n-1)/len;
        long num = start+idx;
        int i = (n-1)%(int)len;
        return String.valueOf(num).charAt(i)-'0';
    }
}