class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(String word:words){
            String[] parts = word.split("\\"+separator);
            for(String part : parts){
                if(!part.isEmpty()) list.add(part);
            }
        }
        return list;
    }
}