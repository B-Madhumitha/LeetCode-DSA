class Solution {
    public int sumOfList(List<Integer> list){
        int sum = 0;
        for(int l:list){
            sum += l;
        }
        return sum;
    }
    public int differenceOfSums(int n, int m) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%m==0) list1.add(i);
            else list2.add(i);
        }
        int s1 = 0,s2 = 0;
        s1 = sumOfList(list1);
        s2 = sumOfList(list2);
        return s2-s1;
    }
}