class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a: arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            count += list.get(i);
            if(count>k) return list.size()-i;
        }
        return 0;
    }
}