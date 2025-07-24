class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        int temp = x;
        if(x<0){
            return false;
        }
        else{
            while(x!=0){
                y = y*10 + x%10;
                x=x/10;
            }
            if(temp==y){
                return true;
            }
        }
        return false;
    }
}