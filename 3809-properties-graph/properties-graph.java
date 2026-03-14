class UFDS{
    private int[] parent;
    private int[] rank;
    //private int count;
    public UFDS(int size){
        parent = new int[size];
        rank = new int[size];
        //count = size;
        for(int i=0;i<size;i++){
            parent[i] = i;rank[i] = 1;
        }
    }
    public int find(int x){
        if(parent[x]!=x) parent[x] = find(parent[x]);
        return parent[x];
    }
    public void union(int x,int y){
        int X = find(x);
        int Y = find(y);
        if(X!=Y){
            if(rank[X]>rank[Y]){
                parent[Y] = X;
            }
            else if(rank[X]<rank[Y]){
                parent[X] = Y;
            }
            else{
                parent[Y] = X;
                rank[X]++;
            }
            //count--;
        }
    }
    public int getUniqueComponents(){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<parent.length;i++){
            set.add(find(i));
        }
        return set.size();
    }
}
class Solution {
    private int intersect(int[] a, int[] b){
        Set<Integer> setA = new HashSet<>();
        for(int n:a){
            setA.add(n);
        }
        Set<Integer> setB = new HashSet<>();
        for(int n:b){
            if(setA.contains(n)) setB.add(n);
        }
        return setB.size();
    }
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length;
        UFDS uf = new UFDS(n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(intersect(properties[i], properties[j])>=k){
                    uf.union(i,j);
                }
            }
        }
        return uf.getUniqueComponents();
    }
}