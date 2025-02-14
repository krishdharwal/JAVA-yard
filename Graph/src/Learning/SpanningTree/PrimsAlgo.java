package Learning.SpanningTree;

import Learning.GraphNode;

import java.util.*;

public class PrimsAlgo {

    public void findMinimumSpanningTree(Map<Integer, List<GraphNode>> map, int startingVertex){
        Set<Integer> visited = new HashSet<>();
        PriorityQueue<GraphNode> queue = new PriorityQueue<>(Comparator.comparingInt(GraphNode::getWeight));
        List<Integer> mst = new ArrayList<>();

        int startVertex = map.get(startingVertex).getFirst().getSource();
        queue.addAll(map.get(startingVertex));
        visited.add(startVertex);
        mst.add(startingVertex);

        while (!queue.isEmpty()){
            GraphNode graphNode = queue.poll();
            int destination = graphNode.getDestination();

            if (visited.contains(destination)){
                continue;
            }

            visited.add(destination);
            mst.add(destination);
            queue.addAll(map.get(destination));
            }

        System.out.println("mst" + mst);

    }

}
