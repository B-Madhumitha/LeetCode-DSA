class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int diff = ((purchaseAmount+5)/10)*10;
        return 100-diff;
    }
}