class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char c : brokenLetters.toCharArray()) set.add(c);
        String[] words = text.split(" ");
        for(String str : words){
            for(char c : str.toCharArray()){
                if(set.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}