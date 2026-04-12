class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[1001];
        for(int[] n:nums){
            for(int i:n) arr[i]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums.length) list.add(i);
        }
        return list;
    }
}