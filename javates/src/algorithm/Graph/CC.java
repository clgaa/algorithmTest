package algorithm.Graph;

import java.util.Stack;

public class CC {
	private boolean[] marked;
	private int[] path;
	private int count;
	private int s;
	
	private int[] ccId;
	private int ccCount;
	public CC(Graph graph, int s) {
		marked = new boolean[graph.V()];
		path = new int[graph.V()];
		ccId = new int[graph.V()];
		count = 0;
		ccCount = 0;
		this.s = s;
		for(int i = 0; i < graph.V(); i++) {
			if(!marked(i)) {
				ccCount++;
				dfs(graph, i);
			}
		}
		dfs(graph, s);
	}
	
	private void dfs(Graph graph, int v) {
		marked[v] = true;
		count++;
		for(int w : graph.adj(v)) {
			if(!marked(w)) {
				path[w] = v;
				ccId[w] = ccCount;
				dfs(graph, w);
			}
		}
	}
	
	public boolean marked(int v) {
		return marked[v];
	}
	
	public int count() {
		return count;
	}
	
	public boolean hasPathTo(int v) {
		return marked(v);
	}
	
	public Iterable<Integer> pathTo(int v) {
		if(!hasPathTo(v)) return null;
		Stack<Integer> stack = new Stack<>();
		for(int i = v; i != s; i = path[i]) {
			stack.push(i);
		}
		stack.push(s);
		return stack;
	}
}
