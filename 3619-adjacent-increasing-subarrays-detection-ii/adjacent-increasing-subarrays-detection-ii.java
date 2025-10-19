class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int []arr = new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                arr[i]=arr[i-1]+1;
            }
            else{
                arr[i]=1;
            }
        }
        int []newar = new int[n];
        newar[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(nums.get(i)<nums.get(i+1)){
                newar[i]=newar[i+1]+1;
            }
            else{
                newar[i]=1;
            }
        }
        int max=0;
        for(int i=0;i<n-1;i++){
            int k=Math.min(arr[i],newar[i+1]);
            max=Math.max(max,k);
        }
        return max;
    }
}