package newproject;
import java.util.*;

public class Depth_first_search {
	LinkedList<Integer>[] adj;
	int V;
	int E;
	public Depth_first_search(int nodes) {
		this.adj=new LinkedList[nodes];
		E=0;
		this.V=nodes;
		for(int i=0;i<nodes;i++) {
			this.adj[i]=new LinkedList<>();
		}
		
	}
	public void new_add(int v,int e) { 
		this.adj[v].add(e);
		this.adj[e].add(v);
		E++;
		
	}
	public String display() {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<V;i++) {
			s.append(i+": ");
			for(int w: adj[i]) {
				s.append(w+" ");
			}s.append("\n");
			
		}return s.toString();
	
	}
	public void dfs(int s) {
		Stack<Integer> stack =new Stack<Integer>();
		boolean[] visited = new boolean[V];
		visited[s]= true;
		stack.push(s);
		
		while(!stack.isEmpty()) {
			int u=stack.pop();
			System.out.print(u+" ");
			for(int w: adj[u]) {
				if(!visited[w]) {
					visited[w]=true;
					stack.push(w);
				}
			}
			
		}
		
		
		
		
		
	}
	public static void main(String arg[]) {
		Depth_first_search g = new  Depth_first_search(5);
		 g.new_add(0, 1);
		 g.new_add(1,2);
		 g.new_add(2, 3);
		 g.new_add(0, 3);
		 g.new_add(2, 4);
		 System.out.print(g.display());
		 g.dfs(0);
	}
	
	

}
