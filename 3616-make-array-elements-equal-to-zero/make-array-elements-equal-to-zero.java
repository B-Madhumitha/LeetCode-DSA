class Solution {
    private static boolean canZero(int []nums,int c,int d){
        int n = nums.length;
        while(c>=0 && c<n){
            if(nums[c]==0){
                c+=d;
            }
            else{
                nums[c]--;
                d =- d;
                c += d;
            }
        }
        for(int num:nums){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(canZero(nums.clone(),i,1)){
                    count++;
                }
                if(canZero(nums.clone(),i,-1)){
                    count++;
                }
            }
        }
        return count;
    }
}