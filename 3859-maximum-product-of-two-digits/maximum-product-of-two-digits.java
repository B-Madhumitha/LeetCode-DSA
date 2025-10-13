class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n /= 10;
        }
        int size = list.size();
        int[] arr = new int[size];
        for(int j=0;j<size;j++){
            arr[j] = list.get(j);
        }
        Arrays.sort(arr);
        return arr[size-1]*arr[size-2];
    }
}