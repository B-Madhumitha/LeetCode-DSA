class Solution {
    static int minElement(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) min = arr[i];
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
    public double average(int[] salary) {
        double ans = 0;
        int sum = 0;
        for(int n:salary){
            sum += n;
        }
        int min = minElement(salary);
        int max = maxElement(salary);
        ans = (double)(sum - (min+max))/(salary.length-2);
        return ans;
    }
}