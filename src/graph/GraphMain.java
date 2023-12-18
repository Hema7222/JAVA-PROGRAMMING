package graph;

public class GraphMain {

	public static void main(String[] args) {
//		GraphLogic graph = new GraphLogic(8);
//		graph.addEdge(3, 7);
//		graph.addEdge(3, 6);
//		graph.addEdge(3, 2);
//		graph.addEdge(7, 4);
//		graph.addEdge(7, 2);
//		graph.addEdge(6, 2);
//		graph.addEdge(4, 9);
//		graph.addEdge(2, 9);
//		
//		graph.print();
		
		
		GraphLogicNew graph = new GraphLogicNew();
		graph.addEdge(7, 2);
		graph.addEdge(7, 8);
		graph.addEdge(2, 9);
		graph.addEdge(2, 6);
		graph.addEdge(8, 6);
		graph.addEdge(9, 4);
		graph.addEdge(4, 6);
		graph.addEdge(6, 2);
		graph.print();

		
		/*graph.addEdge(5, 3);
		graph.addEdge(5, 2);
		graph.addEdge(3, 9);
		//graph.addEdge(9, 3);
		//graph.addEdge(6, 9);
		//graph.addEdge(9, 6);
		graph.addEdge(2, 6);*/
		
		//graph.print();
		System.out.println("----BFS----");
		graph.BFS(2);
		System.out.println("----DFS----");
		graph.DFS(2);
		
//		if(graph.isCyclic()) {
//			System.out.println("Graph contains a cycle");
//		}
//		else {
//			System.out.println("false");
//		}
		
		

	}

}
