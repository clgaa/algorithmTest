package algorithm;

public class QuickFind implements UF{
    int[] id;
    int count = 0;
    int N;
    public QuickFind(int n) {
        count = n;
        N = n;
        id = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if(pId == qId) return;
        for(int i = 0; i < N; i++) {
            if(id[i] == pId) id[i] = qId;
        }
        count--;
    }

    public int find(int p) {
       
        return id[p];
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public int count() {
        // TODO Auto-generated method stub
        return count;
    }
    
    public String toString() {
        for(int i = 0; i < N; i++) {
            System.out.println(id[i]);
        }
        return null;
    }
    
    public static void main(String args[]) {
        QuickFind qf = new QuickFind(6);
        qf.union(0, 1);
        qf.union(1, 2);
        qf.union(2, 3);
        qf.union(3, 5);
        qf.toString();
    }

}
