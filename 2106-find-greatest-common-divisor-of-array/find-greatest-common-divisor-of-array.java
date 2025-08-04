class Solution {
    static int minElement(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    static int maxElement(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int min = minElement(nums);
        int max = maxElement(nums);
        int a = gcd(min,max);
        return a;
    }
}