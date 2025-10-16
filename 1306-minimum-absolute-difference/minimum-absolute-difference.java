class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            diff = Math.min(diff, arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> inner = new ArrayList<>();
            if(arr[i]-arr[i-1] == diff){
                inner.add(arr[i-1]);
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}