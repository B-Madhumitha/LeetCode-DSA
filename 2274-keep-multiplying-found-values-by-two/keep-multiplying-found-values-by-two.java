class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> list = new ArrayList<>();
        for(int n:nums) list.add(n);
        for(int i=0;i<nums.length;i++){
            if(list.contains(original)) original*=2;
        }
        return original;
    }
}