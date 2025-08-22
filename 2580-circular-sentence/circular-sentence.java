class Solution {
    public boolean isCircularSentence(String sentence) {
        String words[] = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String s1 = words[i];
            String s2 = words[(i+1)%words.length];
            char c1 = s1.charAt(s1.length()-1);
            char c2 = s2.charAt(0);
            if(c1 != c2) return false;     
        }
        return true;
    }
}