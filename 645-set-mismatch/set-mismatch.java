class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0,asum=0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        for(int i=1;i<=nums.length;i++) asum+=i;
        for(int i:set) sum+=i;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) arr[0]=nums[i];
            }
        }
        arr[1] = asum-sum;
        return arr;
    }
}