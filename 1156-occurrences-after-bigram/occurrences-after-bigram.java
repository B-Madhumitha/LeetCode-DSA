class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length-2;i++){
            String f = words[i];
            String s = words[i+1];
            if(f.equals(first) && s.equals(second)) list.add(words[i+2]);
        }
        return list.toArray(new String[0]);
    }
}