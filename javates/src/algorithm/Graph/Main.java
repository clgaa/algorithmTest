package algorithm.Graph;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		File f = new File("/Users/didi/Documents/workspace/algorithm/src/Graph/tinyG.txt");
		
		try {
			f.delete();
			if(!f.exists()) {
				f.createNewFile();
				DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
//				out.writeInt(13);
//				out.writeInt(13);
//				out.writeInt(0);
//				out.writeInt(5);
//				out.writeInt(4);
//				out.writeInt(3);
//				out.writeInt(0);
//				out.writeInt(1);
//				out.writeInt(9);
//				out.writeInt(12);
//				out.writeInt(6);
//				out.writeInt(4);
//				out.writeInt(5);
//				out.writeInt(4);
//				out.writeInt(0);
//				out.writeInt(2);
//				out.writeInt(11);
//				out.writeInt(12);
//				out.writeInt(9);
//				out.writeInt(10);
//				out.writeInt(0);
//				out.writeInt(6);
//				out.writeInt(7);
//				out.writeInt(8);
//				out.writeInt(9);
//				out.writeInt(11);
//				out.writeInt(5);
//				out.writeInt(3);
				
				
			out.writeInt(6);
			out.writeInt(8);
			out.writeInt(0);
			out.writeInt(5);
			out.writeInt(2);
			out.writeInt(4);
			out.writeInt(2);
			out.writeInt(3);
			out.writeInt(1);
			out.writeInt(2);
			out.writeInt(0);
			out.writeInt(1);
			out.writeInt(3);
			out.writeInt(4);
			out.writeInt(3);
			out.writeInt(5);
			out.writeInt(0);
			out.writeInt(2);
			}
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
			Graph g = new Graph(in);
			System.out.println(g);
			DepthFirstSearch dfs = new DepthFirstSearch(g, 0);
			
			for(int i = 0; i < g.V(); i++) {
				String s = "0 to " + i +" : ";
				Iterable<Integer> dd = dfs.pathTo(i);
				if(null == dd) return;
				for(int v : dd) {
					s += " " + v;
				}
				System.out.println(s);
			}
			
			
			BreadthFirstPaths bfp = new BreadthFirstPaths(g, 0);
			for(int i = 0; i < g.V(); i++) {
				String s = "0 to " + i +" : ";
				Iterable<Integer> dd = bfp.pathTo(i);
				if(null == dd) return;
				for(int v : dd) {
					s += " " + v;
				}
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	
	private void show(Graph g, Iterable<Integer> dd){
		
	}
}
