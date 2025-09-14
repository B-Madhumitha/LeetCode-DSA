class Solution {
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public long countSubarrays(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int max = findMax(nums);
        long count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max) list.add(i);
            int n = list.size();
            if(n>=k) count += list.get(n-k)+1;
        }
        return count;
    }
}