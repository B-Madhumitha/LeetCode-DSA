class Solution {
    public String sortVowels(String s) {
        String str = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(str.indexOf(c)!=-1) list.add(c);
        }
        Collections.sort(list);
        int idx=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(str.indexOf(c)!=-1){
                sb.append(list.get(idx));
                idx++;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}