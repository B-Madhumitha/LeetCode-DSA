class Solution {
    public static String find(String s){
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int x = s.charAt(i)-'0';
            int y = s.charAt(i+1)-'0';
            int z = (x+y)%10;
            s1.append(z);
        }
        return s1.toString();
    }
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            s = find(s);
        }
        if(s.length()<2) return false;
        return s.charAt(0) == s.charAt(1);
    }
}