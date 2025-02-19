class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        Set<String> set = new HashSet<>();
        for(String ss : bannedWords){
            set.add(ss);
        }
        for(String s : message){
            if(set.contains(s)) count++;
        }
        if(count >= 2) return true;
        else return false;
    }
}