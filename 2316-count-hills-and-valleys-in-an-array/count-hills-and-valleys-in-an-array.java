class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        List<Integer> list = new LinkedList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]) list.add(nums[i]);
        }
        for(int i=1;i<list.size()-1;i++){
            int pr = list.get(i-1), cur = list.get(i), nex = list.get(i+1);
            if(cur>pr && cur>nex) count++;
            else if(cur<pr && cur<nex) count++;
        }
        return count;
    }
}