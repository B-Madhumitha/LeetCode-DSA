class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                set.remove(n);
            }
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(int n:set){
            arr[i++] = n;
        }
        return arr;
    }
}