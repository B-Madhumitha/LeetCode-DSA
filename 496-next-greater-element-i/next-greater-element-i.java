class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> wa = new Stack<>();
        for(int n:nums2){
            while(!wa.isEmpty() && wa.peek()<n){
                map.put(wa.pop(),n);
            }
            wa.push(n);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}