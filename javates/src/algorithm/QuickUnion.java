package algorithm;

public class QuickUnion implements UF{
    int[] id;
    int[] sz;
    int count;
    public QuickUnion(int n) {
        // TODO Auto-generated constructor stub
        count = n;
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        if(sz[pRoot] < sz[qRoot]) {
            sz[qRoot] += sz[pRoot];
            id[pRoot] = qRoot;
        } else {
            sz[pRoot] += sz[qRoot];
            id[qRoot] = pRoot;
        }
        
        count--;
    }

    @Override
    public int find(int p) {
        int node = p;
        while(p != id[p]) p = id[p];
        int point = node;
        while(id[point] != p) {
            int temp = id[point];
            id[point] = p;
            point = temp;
        }
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        // TODO Auto-generated method stub
        return find(p) == find(q);
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return count;
    }

}
