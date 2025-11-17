class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int low=0,high=n-1;
        while(low<=high){
            int length = high-low;
            int breadth = Math.min(height[low],height[high]);
            int area = length*breadth;
            if(area>ans) ans = area;
            if(height[low]<=height[high]) low++;
            else high--;
        }
        return ans;
    }
}