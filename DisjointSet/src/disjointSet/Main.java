package disjointSet;

public class Main {

	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet();
		ds.initialize(6);
		ds.union(1, 3);
		ds.union(3, 5);
		ds.union(2, 4);
		
		System.out.print(ds.find(5));
		
		
	}

}
