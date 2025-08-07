class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(candyType[i],map.getOrDefault(candyType[i],0)+1);
        }
        int nn = map.size();
        return Math.min(nn,n/2);
    }
}