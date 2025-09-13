class Solution {
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public int getFreq(Map<Character,Integer> map){
        int max = 0;
        for(int n:map.values()){
            max = Math.max(max,n);
        }
        return max;
    }
    public int maxFreqSum(String s) {
        Map<Character,Integer> vowel = new HashMap<>();
        Map<Character,Integer> const1 = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                vowel.put(ch,vowel.getOrDefault(ch,0)+1);
            }
            else{
                const1.put(ch,const1.getOrDefault(ch,0)+1);
            }
        }
        int vc= getFreq(vowel),cc=getFreq(const1);
        return vc+cc;
    }
}