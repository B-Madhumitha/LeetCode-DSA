class Solution {
    private static int power(long a,long b, long m){
        long res = 1;
        a %= m;
        while(b>0){
            if(b%2==1) res = (res*a)%m;
            a=(a*a)%m;
            b/=2;
        }
        return (int)res;
    }
    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<variables.length;i++){
            int a = variables[i][0];
            int b = variables[i][1];
            int c = variables[i][2];
            int m = variables[i][3];
            int d = power(a,b,10);
            int ans = power(d,c,m);
            if(ans == target) list.add(i);
        }
        return list;
    }
}