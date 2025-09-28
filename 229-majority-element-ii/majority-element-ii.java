class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int lim = n/3;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            if(val>lim) list.add(key);
        }
        return list;
    }
}