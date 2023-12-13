package graph;

import java.util.ArrayList;

public class GraphLogic {
	ArrayList<Edges> edges = new ArrayList<Edges>();
	int vertics;
	
	public GraphLogic(int vertics) {
		this.vertics=vertics;
	}
	
	public void addEdge(int source, int dest) {
		Edges edge = new Edges(source, dest);
		edges.add(edge);
	}
	
	public void print() {
		edges.forEach(edge ->{
			System.out.println(edge.getSource()+","+edge.getDestination());
		});
		
		/*for(int i=0;i<edges.size();i++){
		 * Edges edge = edges.get(i);
		 * System.out.println(edge.getSource()+","+edge.getDestination());
		 */
	}

}
