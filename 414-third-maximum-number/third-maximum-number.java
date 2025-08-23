class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--) set.add(nums[i]);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        return list.size()>=3?list.get(2):list.get(0);
    }
}