class Solution {
    private String sortDigits(int n){
        char[] arr = String.valueOf(n).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
    public boolean reorderedPowerOf2(int n) {
        String str = sortDigits(n);
        for(int i=0;i<31;i++){
            int power = 1<<i;
            if(str.equals(sortDigits(power))){
                return true;
            }
        }
        return false;
    }
}