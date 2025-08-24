class Solution {
    public int squareDigit(int n){
        int ans = 0;
        while(n>0){
            int rev = n%10;
            ans = ans+(rev*rev);
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1 && !set.contains(n)) {
            set.add(n);
            n = squareDigit(n); 
        }
        return n==1;
    }
}