class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> set = new HashSet<>();
        int asum=0,bsum=0;
        for(int i:aliceSizes) asum+=i;
        for(int i:bobSizes){
            bsum+=i;
            set.add(i);
        }
        int diff = (bsum-asum)/2;
        for(int i:aliceSizes){
            int x = i+diff;
            if(set.contains(x)) return new int[]{i,x};
        }
        return new int[0];
    }
}