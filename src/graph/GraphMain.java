package graph;

public class GraphMain {

	public static void main(String[] args) {
		/*GraphLogic graph = new GraphLogic(8);
		graph.addEdge(3, 7);
		graph.addEdge(3, 6);
		graph.addEdge(3, 2);
		graph.addEdge(7, 4);
		graph.addEdge(7, 2);
		graph.addEdge(6, 2);
		graph.addEdge(4, 9);
		graph.addEdge(2, 9);
		
		graph.print();*/
		
		
		GraphLogicNew graph = new GraphLogicNew();
		graph.addEdge(3, 7);
		graph.addEdge(3, 6);
		graph.addEdge(3, 2);
		graph.addEdge(7, 4);
		graph.addEdge(7, 2);
		graph.addEdge(6, 2);
		graph.addEdge(4, 9);
		graph.addEdge(2, 9);
		
		//graph.print();
		System.out.println("----BFS----");
		graph.BFS(3);
		System.out.println("----DFS----");
		graph.DFS(3);
		
		

	}

}
