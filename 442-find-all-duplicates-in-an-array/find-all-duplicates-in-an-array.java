class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>1) list.add(k);
        }
        return list;
    }
}