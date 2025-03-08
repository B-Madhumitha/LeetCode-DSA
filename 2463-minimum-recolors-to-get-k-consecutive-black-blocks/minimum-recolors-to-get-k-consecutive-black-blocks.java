class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0, res = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length();i++){
            char ch = blocks.charAt(i);
            if(ch=='W') count++;
            if(i<(k-1)) continue;
            res = Math.min(res,count);
            if(blocks.charAt(i-(k-1))=='W') count--;
        }
        return res;
    }
}