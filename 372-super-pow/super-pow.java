class Solution {
    static int power(int a, int b){
        int mul=1;
        a %= 1337;
        for(int i=0;i<b;i++){
            mul = (mul*a)%1337;
        }
        return mul;
    }
    public int superPow(int a, int[] b) {
        int mul = 1;
        for(int i=b.length-1;i>=0;i--){
            mul = (mul * power(a,b[i])) % 1337;
            a = power(a,10);
        }
        return mul;
    }
}