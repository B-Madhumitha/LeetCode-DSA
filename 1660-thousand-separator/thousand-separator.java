class Solution {
    public String thousandSeparator(int n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
            count++;
            if(count%3==0 && i!=0) sb.append('.');
        }
        return sb.reverse().toString();
    }
}