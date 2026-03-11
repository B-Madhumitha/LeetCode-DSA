class Solution {
    public int minOperations(String s) {
        int min = Integer.MAX_VALUE;
        for(char c : s.toCharArray()){
            int num = c-'a';
            if(num!=0) min = Math.min(min,num);
        }
        return (min == Integer.MAX_VALUE)?0:26-min;
    }
}