class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = n;
        for(int i=0;i<n;++i){
            if(words[i].equals(target)){
                int dist = Math.abs(i-startIndex);
                ans = Math.min(ans,Math.min(dist,n-dist));
            }
        }
        return ans<n?ans:-1;
    }
}