class Solution {
    public String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder();
        while(cn>0){
            cn--;
            sb.append((char)(((cn)%26)+'A'));
            cn=(cn)/26;
        }
        return sb.reverse().toString();
    }
}