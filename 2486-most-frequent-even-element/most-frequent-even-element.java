class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int val = 1000000,freq=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(n%2==0){
                map.put(n,map.getOrDefault(n,0)+1);
                if(map.getOrDefault(n,0)>freq || map.getOrDefault(n,0)==freq && n<val){
                    val = n;freq = map.getOrDefault(n,0);
                }
            }
        }
        return freq==0?-1:val;
    }
}