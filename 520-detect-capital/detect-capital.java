class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toLowerCase())) return true;
        else if(word.equals(word.toUpperCase())) return true;
        else if(word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())) return true;
        else return false;
    }
}