class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        String str = Integer.toString(n,2);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch == '1'){
                list.add(1<<i);
            }
        }
        int []arr = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            long prod = 1;
            for(int j=start;j<=end;j++){
                prod = (prod * list.get(j))%((int)1e9+7);
            }
            arr[i] = (int)prod;
        }
        return arr;
    }
}