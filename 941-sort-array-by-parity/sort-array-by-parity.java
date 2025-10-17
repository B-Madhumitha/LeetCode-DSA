class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        List<Integer> elist = new ArrayList<>();
        List<Integer> olist = new ArrayList<>();
        for(int n:nums){
            if(n%2==0) elist.add(n);
            else olist.add(n);
        }
        elist.addAll(olist);
        int j = 0;
        for(int i=0;i<nums.length;i++){
            ans[i] = elist.get(i);
        }
        return ans;
    }
}