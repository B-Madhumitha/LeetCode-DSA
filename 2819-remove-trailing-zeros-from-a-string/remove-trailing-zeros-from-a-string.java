class Solution {
    public String removeTrailingZeros(String num) {
        List<Character> list = new ArrayList<>();
        String ans = "";
        for(int i=num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
            if(ch!='0'){
                for(int j=0;j<=i;j++){
                    list.add(num.charAt(j));
                }
                break;
            }
        }
        for(char c:list) ans+=c;
        return ans;
    }
}