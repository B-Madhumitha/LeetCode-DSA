class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int res = 0, min = prices[0];
        for(int i=1;i<n;i++){
            if(min<prices[i]) res += prices[i]-min;
            min = prices[i];
        }
        return res;
    }
}