class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for(int n:nums){
            if(n<10){
                list.add(n);
            }
            else{
                List<Integer> nlist = new LinkedList<>();
                while(n>0){
                    nlist.add(0,n%10);
                    n/=10;
                }
                list.addAll(nlist);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}