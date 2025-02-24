class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(n>0) set.add(n);
        }
        int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
}