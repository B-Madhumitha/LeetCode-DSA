class Solution {
    static int maxElement(int []arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = maxElement(candies);
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int sum = candies[i]+extraCandies;
            if(sum>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}