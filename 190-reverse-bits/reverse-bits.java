class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        String padded = String.format("%32s", binary).replace(' ', '0');
        String reversed = new StringBuilder(padded).reverse().toString();
        return (int) Long.parseLong(reversed, 2); 
    }
}