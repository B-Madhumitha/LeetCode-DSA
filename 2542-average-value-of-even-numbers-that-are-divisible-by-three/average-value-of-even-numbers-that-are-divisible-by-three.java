class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int n:nums){
            if((n%2==0) && (n%3==0)) list.add(n);
        }
        for(int n:list) sum += n;
        return (list.size()==0)?0:sum/list.size();
    }
}