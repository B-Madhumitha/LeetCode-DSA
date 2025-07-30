class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String str : word1){
            for(char ch : str.toCharArray()){
            sb1.append(ch);
            }
        }
        for(String str : word2){
            for(char ch : str.toCharArray()){
            sb2.append(ch);
            }
        }
        if(sb1.toString().equals(sb2.toString())) return true;
        return false;
    }
}