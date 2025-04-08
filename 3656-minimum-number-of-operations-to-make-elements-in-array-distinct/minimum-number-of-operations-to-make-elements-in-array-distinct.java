class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length<3){
            Set<Integer> set = new HashSet<>();
            for(int i:nums){
                set.add(i);
            }
            if(set.size()==nums.length)return 0;
        }
        int count=0;
        List<Integer> li = new ArrayList<>();
        for(int i:nums){
            li.add(i);
        }
        while(!li.isEmpty()){
            Set<Integer> set = new HashSet<>(li);
            if(set.size()==li.size())break;
            int rc = Math.min(3,li.size());
            for(int i=0;i<rc;i++){
                li.remove(0);
            }
            count++;
        }
        return count;
    }
}