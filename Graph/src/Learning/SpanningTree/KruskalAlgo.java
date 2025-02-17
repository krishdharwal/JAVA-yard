package Learning.SpanningTree;

import Learning.GraphNode;

import java.util.*;

public class KruskalAlgo {
    public KruskalAlgo(){}

    public void kruskalAlgo(Map<Integer, List<GraphNode>> map){
        // firstly add all the graph nodes in priority queue by comparing weights
        PriorityQueue<GraphNode> queue = new PriorityQueue<>(Comparator.comparing(GraphNode::getWeight));
        Set<Integer> visited = new HashSet<>();

        for (Map.Entry<Integer,List<GraphNode>> mapEntry : map.entrySet()){
            queue.addAll(mapEntry.getValue());
        }

        List<GraphNode> mst = new ArrayList<>();
        int countWeight = 0;

       while (!queue.isEmpty()){
           GraphNode currentNode = queue.poll();

           int source = currentNode.getSource();
           int destination = currentNode.getDestination();

           if (visited.contains(source) && visited.contains(destination)){
               continue;
           }

           mst.add(currentNode);
           countWeight += currentNode.getWeight();
           visited.add(source);
           visited.add(destination);


       }

      for (GraphNode node : mst){
          System.out.println(node.getSource() + " -> " + node.getDestination());
      }
        System.out.println("wight =" + countWeight);

    }
}
