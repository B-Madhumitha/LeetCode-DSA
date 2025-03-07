class Solution {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int []arr = {-1,-1};
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int n = Integer.MAX_VALUE;
        if(list.size()<2) return arr;
        for(int i=1;i<list.size();i++){
            int j = list.get(i)-list.get(i-1);
            if(j<n){
                n=j;
                arr[0] = list.get(i-1);
                arr[1] = list.get(i);
            }
        }
        return arr;
    }
}