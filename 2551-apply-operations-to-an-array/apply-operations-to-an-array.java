class Solution {
    public int[] applyOperations(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i] *= 2;
                arr[i+1] = 0;
            }
        }
        int i=0;
        for(int n:arr){
            if(n!=0){
                nums[i++] = n;
            }
        }
        while(i<nums.length){
            nums[i++] = 0;
        }
        return nums;
    }
}