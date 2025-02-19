class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        double med = 0;
        for(int i=0;i<nums1.length;i++){
            li.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            li.add(nums2[i]);
        }
        Collections.sort(li);
        if(li.size()%2==0){
            med = (li.get(li.size()/2)+li.get((li.size()/2)-1))/2.0;
        }
        else{
            med = li.get(li.size()/2);
        }
        return med;
    }
}