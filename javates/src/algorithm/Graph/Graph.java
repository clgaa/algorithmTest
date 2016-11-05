package algorithm.Graph;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Graph {
	private int V;
	private int E;
	private Bag<Integer>[] adj;
	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = (Bag<Integer>[]) new Bag[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new Bag<Integer>();
		}
	}
	
	public Graph(DataInputStream in) throws IOException {
		this(in.readInt());
		int E = in.readInt();
		for(int i = 0; i < E; i++) {
			int v = in.readInt();
			int w = in.readInt();
			addEdge(v, w);
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].put(w);
		adj[w].put(v);
		E++;
	}
	
	public Iterable<Integer> adj(int v) {
		return adj[v];
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("" + V + "\n");
		builder.append("" + E + "\n");
		for(int i = 0; i < V; i++) {
			builder.append(i +" : ");
			for (int data : adj[i]) {
				builder.append(data + " ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}
