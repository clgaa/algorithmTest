package algorithm.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadthFirstPaths {
	private boolean[] marked;
	private int[] path;
	private Queue<Integer> queue = new LinkedList<Integer>();
	private int s;
	
	public BreadthFirstPaths(Graph graph, int s) {
		marked = new boolean[graph.V()];
		path = new int[graph.V()];
		this.s = s;
		bfs(graph, s);
	}
	
	private void bfs(Graph graph, int s) {
		queue.add(s);
		while(!queue.isEmpty()) {
			int v = queue.poll();
			for(int i : graph.adj(v)) {
				if(!marked[i]) {
					path[i] = v;
					queue.add(i);
					marked[i] = true;
				}
			}
		}
	}
	
	public boolean isHasPath(int w) {
		return marked[w];
	}
	
	public Iterable<Integer> pathTo(int w) {
		if(!isHasPath(w)) return null;
		Stack<Integer> stack = new Stack<>();
		for(int i = w; i != s; i = path[i]) {
			stack.add(i);
		}
		
		stack.add(s);
		return stack;
	}

}
