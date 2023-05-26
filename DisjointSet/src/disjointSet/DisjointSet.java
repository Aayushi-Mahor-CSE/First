package disjointSet;

public class DisjointSet {

	public int[] parent;
	
	void initialize(int n) {
		parent = new int[n];
		for(int i=0; i<n; i++) {
			parent[i] = i;
		}
	}
	int find(int x) {
		if(parent[x] == x)return x;
		return find(parent[x]);
	}
	
	void union(int x,int y) {
		int x_parent = find(x);
		int y_parent = find(y);
		
		if(x_parent == y_parent)return;
		else parent[y] = x;
	}

}
