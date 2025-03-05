class Solution {
    static int[] di = {-1,0,1,0};
    static int[] dj = {0,1,0,-1};
    public static int[][] floodFillMat(int [][]ans,int r,int c,int i,int j,int oc,int nc){
        if(i<0||j<0||i>=r||j>=c||ans[i][j]!=oc||ans[i][j]==nc) return ans;
        ans[i][j] = nc;
        for(int k=0;k<4;k++){
            floodFillMat(ans,r,c,i+di[k],j+dj[k],oc,nc);
        }
        return ans;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c = image[sr][sc];
        if(c!=color){
            floodFillMat(image,image.length,image[0].length,sr,sc,c,color);
        }
        return image;
    }
}