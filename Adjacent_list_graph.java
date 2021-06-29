package newproject;
import java.util.*;

public class Adjacent_list {
	LinkedList<Integer>[] adj;
	int V;
	int E;
	public Adjacent_list(int nodes) {
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
	public static void main(String arg[]) {
		 Adjacent_list g = new  Adjacent_list(4);
		 g.new_add(0, 1);
		 g.new_add(2, 3);
		 g.new_add(0, 3);
		 System.out.print(g.display());
	}
	
	

}
