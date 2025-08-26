class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int dLength = 0;
        int area = 0;
        for(int i=0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int sqr = l*l + w*w;
            int ar = l*w;
            if(sqr>dLength){
                dLength = sqr;
                area = ar;
            }
            else if(sqr==dLength) area = Math.max(area,ar);
        }
        return area;
    }
}