class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int min = nums[0];
        int max = nums[n-1];
        for(int i:nums){
            set.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) list.add(i);
        }
        return list;
    }
}