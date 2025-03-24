class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        } 
        int max = 0;
        for(int i:map.values()){
            max = Math.max(i,max);
        }
        int count = 0;
        for(int i:map.values()){
            if(i==max) count+=i;
        }
        return count;
    }
}