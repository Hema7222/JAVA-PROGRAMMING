package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLogicNew {
	HashMap<Integer, ArrayList<Edges>> vertics = new HashMap<Integer, ArrayList<Edges>>();
	
	public GraphLogicNew() {
		
	}
	
	public void addEdge(int source, int dest) {
		Edges edge = new Edges(source, dest);
		ArrayList<Edges> edges;
		if(vertics.get(source) != null)
			edges = vertics.get(source);          
		else
			edges = new ArrayList<Edges>();
		edges.add(edge);
		vertics.put(source, edges);          // key:source ; value:edges
		
		if(!vertics.containsKey(dest)) {       // false means go to next step
			vertics.put(dest, new ArrayList<Edges>());   // empty arraylist is stored
		}                                               // check and add the edges --> one by one values will be checked 
		                                                // and it will add the edges
	}
	
	public void BFS(int startValue) {
		HashMap<Integer, Boolean> verified = new HashMap<Integer, Boolean>();
		vertics.keySet().forEach(key -> {
			verified.put(key, false);        //if it is inside the queue thn it is verified, so thn it will return false
			//System.out.println(key+" : "+false);
		});
		
		Queue<Integer> queueArr = new LinkedList<>();
		queueArr.add(startValue);
		verified.put(startValue, true);
		
		while(queueArr.size() != 0) {          //checks the child node of the start value
			startValue = queueArr.poll();      // if all child node is verified thn it will pop
			System.out.println(startValue);
			
			ArrayList<Edges> startNodeEdges = vertics.get(startValue);
			for(int i=0;i<startNodeEdges.size();i++) {
				int destinationValue = startNodeEdges.get(i).getDestination();
				
				if(!verified.get(destinationValue)) {
					verified.put(destinationValue,true);
					queueArr.add(destinationValue);
					
				}
			}
		}
	}
	
	public void DFSRecursive(int startValue, HashMap<Integer, Boolean> verified) {
		ArrayList<Edges> startNodeEdges = vertics.get(startValue);
		System.out.println(startValue);
		
		for(int i=0;i<startNodeEdges.size();i++) {
			int destinationValue = startNodeEdges.get(i).getDestination();
			
			if(!verified.get(destinationValue)) {
				verified.put(destinationValue,true);
				DFSRecursive(destinationValue, verified);
			}
		}
	}
	
	public void DFS(int startValue) {
		HashMap<Integer, Boolean> verified = new HashMap<Integer, Boolean>();
		vertics.keySet().forEach(key -> {
			verified.put(key, false);
		});
		verified.put(startValue, true);
		DFSRecursive(startValue, verified);
	}
	
	/*public boolean iscycleRecursive(int startValue, HashMap<Integer, Boolean> verified, HashMap<Integer, Boolean> cycleArr) {
		ArrayList<Edges> startNodeEdges = vertics.get(startValue);
		//System.out.println(startValue);
		
		if(cycleArr.get(startValue)) {
			return true;
		}
		
		if(verified.get(startValue)) {
			return false;
		}
		
		for(int i=0;i<startNodeEdges.size();i++) {
			int destinationValue = startNodeEdges.get(i).getDestination();
			
			//if(!verified.get(destinationValue)) {
				//cycleArr.put(destinationValue,true);
				if(iscycleRecursive(destinationValue, verified, cycleArr))
					return true;
				
			}
			
		
		//cycleArr.put(startValue,true);
		return false;
	}
	
	
	public boolean iscycle() {
		HashMap<Integer, Boolean> verified = new HashMap<Integer, Boolean>();
		HashMap<Integer, Boolean> cycleArr = new HashMap<Integer, Boolean>();
		int startValue = 0;
		for(int i=0; i<vertics.keySet().size(); i++) {
			int key = (int)vertics.keySet().toArray()[i];
			verified.put(key, false);
			cycleArr.put(key, false);
			//System.out.println();
			
			if(i==0) {
				startValue=key;
			}
		}
		
		verified.put(startValue, true);
		cycleArr.put(startValue, true);
		
		if(iscycleRecursive(startValue,verified,cycleArr))
			return true;
		
		return false;
	}*/
	
//	public boolean isCyclic() {
//        HashMap<Integer, Boolean> verified = new HashMap<>();
//        HashMap<Integer, Boolean> cycleArr = new HashMap<>();
//
//        vertics.keySet().forEach(key -> {
//        	verified.put(key, false);
//            cycleArr.put(key, false);
//        });
//
//        for (int key : vertics.keySet()) {
//            if (isCycle(key, verified, cycleArr)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    private boolean isCycle(int startvalue, HashMap<Integer, Boolean> verified, HashMap<Integer, Boolean>cycleArr) {
//        if (cycleArr.get(startvalue)) {
//            return true; // Cycle detected
//        }
//
//        if (verified.get(startvalue)) {
//            return false; // Already verified, no cycle
//        }
//
//        verified.put(startvalue, true);
//        cycleArr.put(startvalue, true);
//
//        ArrayList<Edges> startNodeEdges = vertics.get(startvalue);
//        for (int i = 0; i < startNodeEdges.size(); i++) {
//            int destinationValue = startNodeEdges.get(i).getDestination();
//            if (isCycle(destinationValue, verified, cycleArr)) {
//                return true;
//            }
//        }
//
//        cycleArr.put(startvalue, false); // Backtrack
//        return false;
//    }
	
	public void print() {
		vertics.keySet().forEach(key -> {
			vertics.get(key).forEach(edge -> {
				System.out.println(edge.getSource()+","+edge.getDestination());
			});
		});
		
		/*for(int i=0;i<edges.size();i++){
		 * Edges edge = edges.get(i);
		 * System.out.println(edge.getSource()+","+edge.getDestination());
		 */
	}

}
