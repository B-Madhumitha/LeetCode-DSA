class Solution {
    public int[] finalPrices(int[] prices) {
        int []arr = new int[prices.length];
        int k=0;
        for(int n:prices) arr[k++]=n;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    arr[i] = prices[i]-prices[j];
                    break;
                }
            }
        }
        return arr;
    }
}