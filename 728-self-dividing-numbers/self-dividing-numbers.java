class Solution {
    public boolean selfDividing(int n){
        for(char c:String.valueOf(n).toCharArray()){
            if(c=='0'||(n%(c-'0')>0)) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDividing(i)) list.add(i);
        }
        return list;
    }
}