package newproject;

public class adjacent_matrix {
	int[][] adj;
	int E;
	int V;
	public adjacent_matrix(int nodes) {
		this.adj=new int[nodes][nodes];
		this.V=nodes;
		E=0;
		}
	public void add_new(int v,int e) {
		this.adj[v][e]=1;
		this.adj[e][v]=1;
		E++;
	}
	public String display() {
		StringBuilder s=new StringBuilder();
		s.append("Adjacent Matrix" +"\n");
		for(int i=0;i<V;i++){
			s.append(i+": ");
			for(int j=0;j<V;j++) {
				s.append(adj[i][j]+" ");
				}s.append("\n");
		}
		return s.toString();
	}
	public static void main(String ar[]) {
		adjacent_matrix g=new adjacent_matrix(4);
		g.add_new(0, 1);
		g.add_new(2, 3);
		g.add_new(0, 3);
		System.out.print(g.display());
	}

}
