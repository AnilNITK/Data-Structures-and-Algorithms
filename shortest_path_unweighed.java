package newproject;
import java.util.*;

public class shortest_path_unweighed {
	LinkedList<Integer>[] adj;
	int V;
	int E;
	public shortest_path_unweighed(int nodes) {
		this.V= nodes;
		this.adj=new LinkedList[V];
		this.E=0;
		for(int i=0;i<V;i++) {
			this.adj[i]=new LinkedList<>();
		}
	}
	public void add_new(int v,int w) {
		this.adj[v].add(w);
	}
	public void print(int s) {
		Queue<Integer> q= new LinkedList<>();
		int[] path = new int[V];
		int[] distance= new int[V];
		Arrays.fill(distance, -1);
		distance[s] = 0;
		q.add(s);
		while(!q.isEmpty()) {
			int v=q.poll();
			for(int w: adj[v]) {
				if(distance[w]==-1) {
					distance[w]=distance[v]+1;
					path[w]=v;
					q.add(w);
				}
			}
		}
	}
	public static void main(String args[]) {
		shortest_path_unweighed graph = new shortest_path_unweighed(6);
		graph.add_new(5, 2);
		graph.add_new(5, 0);
		graph.add_new(2, 3);
		graph.add_new(3, 1);
		graph.add_new(4, 0);
		graph.add_new(4, 1);
		
	}

}
