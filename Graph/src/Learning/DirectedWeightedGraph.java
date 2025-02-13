package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedWeightedGraph {
    private Map<Integer, List<GraphNode>> map;
    private int vertex;

    DirectedWeightedGraph(int vertices){
        this.map = new HashMap<>();
        this.vertex = vertices;

        for (int i = 1; i <= vertices; i++) {
            this.map.put(i,new ArrayList<>());
        }
    }

    public void addDirectedEdge(int source , int destination , int weight){
        GraphNode graphNode = new GraphNode(source,destination,weight);
        assert map.containsKey(source);
        map.get(source).add(graphNode);
    }

    public void addUnDirectedEdge(int source , int destination, int weight){
        GraphNode graphNode1 = new GraphNode(source,destination,weight);
        GraphNode graphNode2 = new GraphNode(destination,source,weight);
        assert map.containsKey(source) && map.containsKey(destination);
        map.get(source).add(graphNode1);
        map.get(destination).add(graphNode2);
    }

    public void display(){
        int tempVertex = 1;
        while (tempVertex < vertex) {
            for (GraphNode ele : map.getOrDefault(tempVertex, new ArrayList<>())) {
                System.out.print(tempVertex + " -> " + ele.getDestination());
                System.out.println();
            }
            tempVertex++;
        }
    }

    public static void main(String[] args) {
        DirectedWeightedGraph graph = new DirectedWeightedGraph(5);

        graph.addDirectedEdge(1,2,4);
        graph.addDirectedEdge(2,3,2);
        graph.addUnDirectedEdge(2,4,5);
        graph.addUnDirectedEdge(4,5,1);
        graph.addDirectedEdge(1,4,9);

        graph.display();
    }
}

